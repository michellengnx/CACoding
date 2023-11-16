package use_case.clear_users;

import entity.UserFactory;
import use_case.signup.SignupOutputData;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary  {

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;
    final UserFactory userFactory;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary userPresenter, UserFactory userFactory) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
        this.userFactory = userFactory;
    }

    @Override
    public void execute() {
        if (userDataAccessObject.getNumberOfUsers() == 0) {
            userPresenter.prepareFailView("No users exist");
        } else {
            ArrayList<String> users = userDataAccessObject.clear();
            ClearOutputData clearOutputData = new ClearOutputData(users, false);
            userPresenter.prepareSuccessView(clearOutputData);
        }

    }
}
