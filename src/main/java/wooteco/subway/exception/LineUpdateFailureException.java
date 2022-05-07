package wooteco.subway.exception;

public class LineUpdateFailureException extends SubwayUnknownException {

    private static final String DEFAULT_MESSAGE = "노선 수정에 실패하였습니다";

    public LineUpdateFailureException(Long id) {
        super(DEFAULT_MESSAGE + " : " + id);
    }
}
