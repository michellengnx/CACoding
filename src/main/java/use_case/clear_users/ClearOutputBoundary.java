package use_case.clear_users;
public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData users);

    void prepareFailView(String error);
}