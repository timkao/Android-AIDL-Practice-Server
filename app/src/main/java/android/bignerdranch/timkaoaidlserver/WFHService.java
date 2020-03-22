package android.bignerdranch.timkaoaidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

public class WFHService extends Service {

    private MyImpl impl = new MyImpl();

    public WFHService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i("@tim", "start binding");
        Toast.makeText(getApplicationContext(), "binding", Toast.LENGTH_SHORT).show();
        return impl;
    }

    private class MyImpl extends android.bignerdranch.timkaoaidlserver.ICommon.Stub {

        @Override
        public int calculate(int num1, int num2) throws RemoteException {
            return num1 + num2;
        }
    }
}
