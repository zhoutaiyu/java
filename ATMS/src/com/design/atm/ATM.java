package com.design.atm;

public class ATM {
	
	private boolean userAuthenticated;   //�û��Ƿ���ͨ����֤
	private int currentAccountNumber;  //��ǰ �û��˺�
	private Screen screen;                           //ATM������Ļ
	private Keypad keypad;                         //ATM���ļ���
	private CashDispenser cashDispenser;  //ATM����ȡ���
	private DepositSlot depositSlot;            //ATM���Ĵ���
	private BankDatabase bankDatabase;  //�˻���Ϣ���ݿ�
		
	//���˵���������
	private static final int BALANCE_INQUIRY=1;
	private static final int WITHDRAWL=2;
	private static final int DEPOSIT=3;
	private static final int EXIT=4;
	
	//�޲εĹ��캯�������ڶ����ϳ�Ա�������г�ʼ��
	public ATM()
	{
		userAuthenticated=false;
		currentAccountNumber=0;
		screen=new Screen();
		keypad=new Keypad();
		cashDispenser=new CashDispenser();
		depositSlot=new DepositSlot();
		bankDatabase=new BankDatabase();
	}
	
	//����ATM
	public void run()
	{
		//�û���ӭ���棻����ִ�н���
		while(true){
			while(!userAuthenticated){
				screen.displayMessageLine("Welcome!"); //��ӭ��Ϣ
				authenticate();                        //��֤�û���Ϣ 								
			}
			
			performTransactions();
			userAuthenticated=false;
			currentAccountNumber=0;
			screen.displayMessageLine("Thank you,88!");
			
		}
	}
	
	public void authenticate(){
		
		screen.displayMessageLine("Please input your account number:");
		int accountNumber=keypad.getInput();                       //�����˻���
		
		screen.displayMessageLine("Please input your PIN��");//��������
		int pin=keypad.getInput();
		
		userAuthenticated=bankDatabase.authenticate(accountNumber, pin);
		
		if(userAuthenticated)
			currentAccountNumber=accountNumber;
		else
			screen.displayMessageLine("Invalid account Number or pin,please try again!");	
			
	}
	
	
	private void performTransactions(){
		
			Transaction currentTransaction=null;
			
			boolean userExited=false;
			
			while(!userExited){
					int mainMenuSelection=displayMainMenu();
					
					switch(mainMenuSelection){
					case BALANCE_INQUIRY:
					case WITHDRAWL:
					case DEPOSIT:
						currentTransaction=createTransaction(mainMenuSelection);
						currentTransaction.execute();
						break;
					case EXIT:
						userExited=true;
						break;
					default:
						screen.displayMessageLine("You entered an invalid selection, please try again!");
						break;
					}
			}
	}
	
	private Transaction createTransaction(int type){
		
		Transaction temp=null;
		switch(type){
		case BALANCE_INQUIRY:
			temp=new BalanceInquiry(currentAccountNumber,screen,bankDatabase);
			break;
		case WITHDRAWL:
			temp=new Withdrawl(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
			break;
		case DEPOSIT:
			temp=new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
			break;
		
		}
		
		return temp;
	}
	
	private int displayMainMenu(){
			
			screen.displayMessageLine("Welcome!");
			screen.displayMessageLine("1:View my balance");
			screen.displayMessageLine("2:Withdraw cash");	
			screen.displayMessageLine("3:Deposit cash");
			screen.displayMessageLine("4:Exit");
			screen.displayMessageLine("Please Enter a choice");
			
			return keypad.getInput();
	}

}
