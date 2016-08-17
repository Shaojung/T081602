package tw.com.pcschool.t081602;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d("MYB", "收到廣播");

        Intent it = new Intent(context, MyService.class);
        context.startService(it);

        // throw new UnsupportedOperationException("Not yet implemented");
    }
}
