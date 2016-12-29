//��Transaction������֮һ�����ڱ�ʾȡ������
package com.design.atm;

public class Withdrawl extends Transaction {
	
	private int amount;
	private Keypad keypad;
	private CashDispenser cashDispenser;

	private final static int CANCELED=5;
	public Withdrawl(int accountNum, Screen screen, BankDatabase bankDatabase,
			                    Keypad keyPad,CashDispenser cashdispenser) {
		super(accountNum, screen, bankDatabase);
		// TODO Auto-generated constructor stub
		keypad=keyPad;
		cashDispenser=cashdispenser;		
	}
	

//����Transaction���execute����	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		boolean cashDispensed=false;
		double availableBalance;
		
		BankDatabase bankDatabase=getBankDatabase();  //���ݿ⽫ͨ�������getter�������
		Screen screen=getScreen();                                   //��ĻҲͬ��
		
		do{
			
			   amount=displayMenuOfAmounts();
			   //�û���������Ч�Ľ��
			   if(amount!=CANCELED){
				   //��ø��˻��Ŀ������(�˺Ž��̳и�����˺����ԣ�ͨ�������getter�������)
				   availableBalance=bankDatabase.getAvailableBalance(getAccountNum());
				   
				   //����������>=ȡ����,��ͨ�����ݿ���˻����в���
				   if(amount<=availableBalance){
					   
					   	if(cashDispenser.isSufficientCash(amount)){
					   			
					   			bankDatabase.debit(getAccountNum(), amount);
					   			cashDispenser.dispenseCash(amount);
					   			cashDispensed=true;
					   			
					   			screen.displayMessageLine("Your cash has been dispensed");					   			
					   	}
					   	else
					   		screen.displayMessageLine("Insufficient cash in ATM");					   				   		
				   }
				   else
					   	screen.displayMessageLine("Insufficient cash in your account");
			   }
			   else{
				   screen.displayMessageLine("you have canceled");//�û�ȡ����ȡ�����
				   return;
			   }
		}while(!cashDispensed);
	}
	
	
	//��ʾȡ��ʱATM���Ľ�����ʾ����ʾ�û�����ȡ��������ظý��
	private int displayMenuOfAmounts(){
			
			int userChoice=0;
			
			Screen screen=getScreen();
			
			int amounts[]={0,100,200,300,500};
			
			while(userChoice==0){
				
				screen.displayMessageLine("Menu");
				screen.displayMessageLine("1:100");
				screen.displayMessageLine("2:200");				
				screen.displayMessageLine("3:500");
				screen.displayMessageLine("4:1000");
				screen.displayMessageLine("5:Cancel");
				
				int input=keypad.getInput();
				
				switch(input){
				case 1:
				case 2:
				case 3:
				case 4:
					userChoice=amounts[input];
					break;
				case CANCELED:
					userChoice=CANCELED;
					break;
				default:
					screen.displayMessageLine("Try again!");
					break;
				}
				
			}
			return userChoice;
	}
}
