package com.OOP;

public class BankAccount {

        private double accountNumber;
        private double customerBalance;
        private String customerName;
        private String customerEmail;
        private String customerPhoneNumber;


        public void depositFunds(double depositAmount){
                try {
                        customerBalance += depositAmount;
                        System.out.println("Deposit of $ " + depositAmount + " made. New balance is $ " + this.customerBalance);
                } catch (Exception nfc)
                {
                        System.out.println("Enter valid amount in digits");
                        System.out.println(nfc);
                }

        }

        public void withdrawFunds(double withdrawlAmount){

                try{
                if ( customerBalance - withdrawlAmount < 0 || withdrawlAmount <0){
                        System.out.println("You don't have sufficient balance, Your current balance is $" + customerBalance);
                } else {

                        customerBalance -= withdrawlAmount;
                        System.out.println("Transaction successful, you remaining balance is $" + customerBalance);

                }
                } catch (Exception e){

                        System.out.println("Enter valid amount in digits");
                        System.out.println(e);
                }

        }




        public double getAccountNumber() {
                return accountNumber;
        }

        public void setAccountNumber(double accountNumber) {
                this.accountNumber = accountNumber;
        }

        public double getCustomerBalance() {
                return customerBalance;
        }

        public void setCustomerBalance(double customerBalance) {
                this.customerBalance = customerBalance;
        }

        public String getCustomerName() {
                return customerName;
        }

        public void setCustomerName(String customerName) {
                this.customerName = customerName;
        }

        public String getCustomerEmail() {
                return customerEmail;
        }

        public void setCustomerEmail(String customerEmail) {
                this.customerEmail = customerEmail;
        }

        public String getCustomerPhoneNumber() {
                return customerPhoneNumber;
        }

        public void setCustomerPhoneNumber(String customerPhoneNumber) {
                this.customerPhoneNumber = customerPhoneNumber;
        }

}
