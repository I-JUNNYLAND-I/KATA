package git.io.urlValidator;

public class WebClient {
    private final String url;
    private WebClient(String url) {this.url = url;}

    public Long validate(Long left, Long right) throws IllegalAccessException {
        switch (request()) {
            case "200" -> {return left + right;}
            case "404" -> {return left;}
            case "500" -> {return right;}
        }
        throw new IllegalAccessException("잘못된 URL입니다.");
    }

    private String request() {
        if (url.equals("http://naver.com") || url.equals("http://daum.net")) {
            return "200";
        } else if (url.equals("http://nate.pkt")) {
            return "404";
        }
        return "404";
    }

    public static WebClient of(String url) {return new WebClient(url);}

}
