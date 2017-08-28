package behavioral.command;

class Developer {
    private Command insert;
    private Command update;
    private Command select;
    private Command delete;

    Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    void insertCommand() {
        insert.execute();
    }

    void updateCommand() {
        update.execute();
    }

    void deleteCommand() {
        delete.execute();
    }

    void selectCommand() {
        select.execute();
    }
}
