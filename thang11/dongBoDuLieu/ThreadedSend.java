package thang11.dongBoDuLieu;

class ThreadedSend extends Thread {
    private int time;
    private String nguoiMuonPhong;
    PhongHocVer2 sender;

    // Recieves a message object and a string
    // message to be sent
    ThreadedSend(int thoiGianMuon,String tempNguoi, PhongHocVer2 obj) {
        time = thoiGianMuon;
        nguoiMuonPhong=tempNguoi;
        sender = obj;
    }

    public void run() {
        // Only one thread can send a message
        // at a time.
        synchronized (sender) {
            // synchronizing the snd object
            sender.send(time,nguoiMuonPhong);
        }
    }
}

