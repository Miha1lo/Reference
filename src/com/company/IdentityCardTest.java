package com.company;

public class IdentityCardTest {
    public static void main(String[] args) {

        IdentityCard juniorEmployee = new IdentityCard();
        juniorEmployee.name = "Mike";
        juniorEmployee.birthDay = "10/12/1994";
        juniorEmployee.idCode = "ЕВ125615";

        System.out.println("Data of junior employee: ");
        System.out.println("Name: " + juniorEmployee.name);
        System.out.println("Birthday: " + juniorEmployee.birthDay);
        System.out.println("id code: " + juniorEmployee.idCode);
        System.out.println();

        IdentityCard middleEmployee = new IdentityCard();
        middleEmployee.name = "Anna";
        middleEmployee.birthDay = "31/05/1990";
        middleEmployee.idCode = "ВА872534";

        System.out.println("Data of middle employee: ");
        System.out.println("Name: " + middleEmployee.name);
        System.out.println("Birthday: " + middleEmployee.birthDay);
        System.out.println("id code: " + middleEmployee.idCode);
        System.out.println();

        IdentityCard siniorEmployee = new IdentityCard();
        siniorEmployee.name = "Josh";
        siniorEmployee.birthDay = "24/07/1984";
        siniorEmployee.idCode = "CM549175";

        System.out.println("Data of sinior employee: ");
        System.out.println("Name: " + siniorEmployee.name);
        System.out.println("Birthday: " + siniorEmployee.birthDay);
        System.out.println("id code: " + siniorEmployee.idCode);
        System.out.println();

    }
}
