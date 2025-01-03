package api.app.bekiniCity.webConfig;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebErrorController implements ErrorController {

    private final String ERROR_PATH = "/error";

    @GetMapping(ERROR_PATH)
    public String redirectRoot() {
        String url = "";
        try {
            url = "index.html";
        } catch (Exception error) {
            System.out.println(error.getStackTrace());
        }
        return url;
    }

    public String getERROR_PATH() {
        return null;
    }
}
