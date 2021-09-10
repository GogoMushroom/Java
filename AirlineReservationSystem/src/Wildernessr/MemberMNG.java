package Wildernessr;

public class MemberMNG {
   private String ID = null;
   private String PW = null;
   private String Name = null;
   private boolean isMan = false;
   private String birth = null;
   private String email = null;
   private int price = 0; // �����ݾ�
   private String ticketInformation = null;
   private long cardNum = 0; // ī���ȣ(-���� ���ڸ� �Է��ϼ���)
   private int Validity = 0; // ��ȿ�Ⱓ (mmYY)
   private int Installment = 0;// �Һ�
   private int cvcNum = 0; // CVC�ѹ�
   private String cardCompany = null;

   public MemberMNG(String iD, String pW, String name) {
      this.ID = iD;
      this.PW = pW;
      this.Name = name;
   }

   public MemberMNG(boolean isMan, String birth, String email) {
      this.isMan = isMan;
      this.birth = birth;
      this.email = email;
   }

   public MemberMNG(String iD, String pW, String name, boolean isMan, String birth, String email) {
      this.ID = iD;
      this.PW = pW;
      this.Name = name;
      this.isMan = isMan;
      this.birth = birth;
      this.email = email;
   }

   public String getTicketInformation() {
      return ticketInformation;
   }

   public void setTicketInformation(String ticketInformation) {
      this.ticketInformation = ticketInformation;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public long getCardNum() {
      return cardNum;
   }

   public void setCardNum(long cardNum) {
      this.cardNum = cardNum;
   }

   public int getValidity() {
      return Validity;
   }

   public void setValidity(int validity) {
      Validity = validity;
   }

   public int getInstallment() {
      return Installment;
   }

   public void setInstallment(int installment) {
      Installment = installment;
   }

   public int getCvcNum() {
      return cvcNum;
   }

   public void setCvcNum(int cvcNum) {
      this.cvcNum = cvcNum;
   }

   public String getCardCompany() {
      return cardCompany;
   }

   public void setCardCompany(String cardCompany) {

      this.cardCompany = cardCompany;
   }

   public boolean isMan() {
      return isMan;
   }

   public void setMan(boolean isMan) {
      this.isMan = isMan;
   }

   public String getBirth() {
      return birth;
   }

   public void setBirth(String birth) {
      this.birth = birth;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getID() {
      return ID;
   }

   public String getPW() {
      return PW;
   }

   public String getName() {
      return Name;
   }

   public void setID(String iD) {
      ID = iD;
   }

   public void setPW(String pW) {
      PW = pW;
   }

   public void setName(String name) {
      Name = name;
   }

   @Override
   public String toString() {
      return "ID : " + ID + " PW : " + PW + " Name : " + Name;
   }
}