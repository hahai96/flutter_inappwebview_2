package com.pichillilorenzo.flutter_inappwebview.CredentialDatabase;

import android.provider.BaseColumns;

public class ProtectionSpaceContract {
  private ProtectionSpaceContract() {}

  /* Inner class that defines the table contents */
  public static class FeedEntry implements BaseColumns {
    public static final String TABLE_NAME = "protection_space";
    public static final String COLUMN_NAME_HOST = "host";
    public static final String COLUMN_NAME_PROTOCOL = "protocol";
    public static final String COLUMN_NAME_REALM = "realm";
    public static final String COLUMN_NAME_PORT = "port";
  }
}
