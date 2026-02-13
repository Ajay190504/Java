package abstraction.pract2interface;

class GoogleDrive implements Google {

    @Override
    public void login(String email, String password) {
        System.out.println("Google Drive login successful for: " + email);
    }

    @Override
    public void signup(String email, String password) {
        System.out.println("Google Drive account created for: " + email);
    }

    public void uploadFile(String fileName) {
        System.out.println("Uploading file: " + fileName);
    }

    public void downloadFile(String fileName) {
        System.out.println("Downloading file: " + fileName);
    }

    public static void main(String[] args) {
    	
        GoogleDrive drive = new GoogleDrive();
        //Google drive = new GoogleDrive(); //Not allowing access to GoogleDrive Methods
        
        drive.signup("ajay@gmail.com", "1234");
        drive.login("ajay@gmail.com", "1234");
        drive.uploadFile("project.zip");
        drive.downloadFile("project.zip");
    }
}

