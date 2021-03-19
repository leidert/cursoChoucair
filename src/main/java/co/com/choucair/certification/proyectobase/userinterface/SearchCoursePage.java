package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static Target BUTTON_UC = Target.the("selecciona Cursos y certificaciones").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static Target INPUT_COURSE =  Target.the("buscaR el curso").located(By.id("coursesearchbox"));
    public static Target BUTTON_GO = Target.the("Da click para buscar el curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static Target SELECT_COURSE = Target.the("Da click para buscar el curso").located(By.xpath("//div[@class='search-results']/div[1]/h4/a"));
    public static Target NAME_COURSE = Target.the("Mensaje a verificar").located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));
}
