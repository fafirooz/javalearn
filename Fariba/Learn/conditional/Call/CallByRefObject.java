package Fariba.Learn.conditional.Call;

public class CallByRefObject { //Example of Call by Reference using Object.

    int number = 10;

    // pass object as parameter
    /*در روش call by reference، زمانی که تابع بر روی آرگومان ارسالی که یک متغیر از نوع آبجکت بوده و
    حاوی آدرس آن در حافظه ی heap می باشد، تغییری را اعمال می کند، آن تغییر بر روی اصل مقدار نیز اعمال می شود.*/
    public static void increment(CallByRefObject a) {
        a.number = a.number + 1;  // increment variable by 1
        System.out.println("value in method: " + a.number);
    }

    public static void main(String[] args) {
        CallByRefObject a = new CallByRefObject(); // pb is an object of class CallByReference
        System.out.println("value before method call: " + a.number);
        increment(a); // pass object of the class CallByReference
        System.out.println("value after method call: " + a.number);
    }
}

