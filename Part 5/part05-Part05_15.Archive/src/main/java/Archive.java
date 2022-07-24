public class Archive {
    private String name;
    private String identifier;


    public Archive(String archiveName, String archiveIdentifier) {
        this.name = archiveName;
        this.identifier = archiveIdentifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        if (this.identifier.equals(comparedArchive.identifier)) {
            return true;
        }

        return false;

    }


}
