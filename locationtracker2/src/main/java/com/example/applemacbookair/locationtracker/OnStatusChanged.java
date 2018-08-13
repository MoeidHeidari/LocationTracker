package com.example.applemacbookair.locationtracker;

import android.os.Bundle;

/**
 * Created by applemacbookair on 8/13/18.
 */

public interface OnStatusChanged
{
    void onChange(String provider, int status, Bundle extras);
}
