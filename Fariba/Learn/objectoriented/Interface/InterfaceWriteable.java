package Fariba.Learn.objectoriented.Interface;

public interface InterfaceWriteable { // رابط یا واسط- for readable more easily- interface is a keyword-is a completely "abstract class"-

    public void write(String text);
}

    // یکی از دلایل مهم استفاده از اینترفیس در جاوا ، یافتن روشی برای انجام وراثت چندگانه است، چون این نوع از وراثت در جاوا پشتیبانی نمی‌شود.
    // اینترفیس فقط شامل متدهایی خواهد بود که پیاده‌سازی ندارند یعنی همان متدهایی که دارای بدنه نیستند و فقط می‌تواند حاوی امضای متد و فیلدها باشد
    // اینترفیس‌ها نقشه ساخت کلاس‌ها به حساب می‌آیند. آن‌ها هرگز برای نمایش اشیا ساخته نشده‌اند
    // جاوا از وراثت چندگانه پشتیبانی نمی‌کند به همین دلیل به کلاس‌ها این امکان را نمی‌دهد که بیش از یک کلاس را در یک نمونه بسط دهد.
    // نمونه‌ها عناصر مستقل برنامه با ویژگی‌ها و داده‌های مرتبط به هم هستند. کلاس‌های فرزندان نمی‌توانند ویژگی‌های کلاس والد چندگانهرا در یک نمونه به ارث ببرند، زیرا باعث به وجود آمدن «مسئله الماسی» می شوند
    // اینترفیس در جاوا دقیقاً مانند انتزاع در شی گرایی جزئیات پیاده‌سازی را مخفی می‌کند و فقط عملکرد را به کاربر نشان می‌دهد. اما تفاوت‌هایی بین انتزاع و اینترفیس در جاوا وجود دارند.
    // اولین تفاوت این است که تمام متدهای توصیف شده در داخل اینترفیس شامل هیچ پیاده‌سازی نیستند، در حالی که متدهای داخل انتزاع می‌توانند همراه با پیاده‌سازی و بدون آن باشند.
    // تفاوت کلیدی دیگر این است که همه متدهای تعریف شده در اینترفیس باید توسط کلاسی اجرا شوند که آن را پیاده‌سازی می‌کند. در حالی که در مورد کلاس انتزاع که کلاس انتزاعی را بسط می‌دهد تنها می‌تواند متدهای مورد نیاز را رونویسی کند.
    // multiply inheritance
    // protocol is a same language.
    // implement = پیاده سازی
    // هر کلاس به یک ابسترکت ارجاع داده میشه اما میتونه به تعداد نامحدودی اینترفیس پیاده سازی میشه
    // To access the interface methods by another class with the implements keyword (instead of extends).
    // The body of the interface method is provided by the "implement" class
    // Like abstract classes, interfaces cannot be used to create objects
    // On implementation of an interface, you must override all of its methods
    // An interface cannot contain a constructor (as it cannot be used to create objects)


interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class Main {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

