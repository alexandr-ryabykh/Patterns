package behavioral.memento;

class GithubRepo {
    private Save save;

    Save getSave() {
        return save;
    }

    void setSave(Save save) {
        this.save = save;
    }
}
