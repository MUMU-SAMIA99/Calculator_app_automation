import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CalScreen {
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    static

    WebElement btn1;

    @FindBy(id = "com.google.android.calculator:id/digit_0")
    static

    WebElement btn0;

    @FindBy(id = "com.google.android.calculator:id/digit_6")
    static

    WebElement btn6;


    @FindBy(id = "com.google.android.calculator:id/digit_5")
    static

    WebElement btn5;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    static

    WebElement btndivide;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    static

    WebElement btnmultiplmultiply;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    static

    WebElement btnminus;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    static

    WebElement btnplus;

    @FindBy(id = "com.google.android.calculator:id/eq")
    static

    WebElement btnequal;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    static
    WebElement txtResult;

    public CalScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static String math() {
        btn1.click();
        btn0.click();
        btn0.click();
        btndivide.click();
        btn1.click();
        btn0.click();
        btnmultiplmultiply.click();
        btn5.click();
        btnminus.click();
        btn1.click();
        btn0.click();
        btnplus.click();
        btn6.click();
        btn0.click();
        btnequal.click();


        return txtResult.getText();

    }
}
