package Controller;

public interface RegexPatterns {
    public static final String REGEX_UA_PATTERN = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    public static final String REGEX_ENG_PATTERN = "^[A-Z][a-z]{1,20}$";
    public static final String REGEX_LOGIN_PATTERN = "^[A-Za-z0-9_-]{6,20}$";


}
