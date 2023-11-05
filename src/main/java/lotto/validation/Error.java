package lotto.validation;

public enum Error {
    INTEGER_ERROR("구입 금액은 정수여야 합니다."),
    DIVISIBLE_ERROR("구입 금액은 1,000원 단위로 입력해야 합니다.");

    private String error;

    Error(String error) {
        this.error = error;
    }

    public String message() {
        return error;
    }
}