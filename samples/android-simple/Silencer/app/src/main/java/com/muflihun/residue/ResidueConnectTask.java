package com.amrayn.residue;

import android.os.AsyncTask;

public class ResidueConnectTask extends AsyncTask<Object, Object, Void> {
    protected Void doInBackground(Object... urls) {

        try {
            Residue.getInstance().reconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
