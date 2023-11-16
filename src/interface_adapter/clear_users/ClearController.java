package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {

    final ClearInputBoundary clearUsersUseCaseInteractor;
    public ClearController(ClearInputBoundary clearUsersUseCaseInteractor) {
        this.clearUsersUseCaseInteractor = clearUsersUseCaseInteractor;
    }

    public void execute() {
        clearUsersUseCaseInteractor.execute();
    }
}
