.class public Lcom/jieli/watchtesttool/tool/config/ConfigHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final KEY_ADJUST_BLE_MTU:Ljava/lang/String; = "key_adjust_ble_mtu"

.field private static final KEY_ADV_FILTER_PREFIX:Ljava/lang/String; = "key_adv_filter_prefix"

.field private static final KEY_BAN_AUTO_TEST:Ljava/lang/String; = "key_ban_auto_test"

.field private static final KEY_FILTER_DEVICE:Ljava/lang/String; = "key_filter_device"

.field private static final KEY_SPP_CONNECT_WAY:Ljava/lang/String; = "key_spp_connect_way"

.field private static final KEY_TEMP_CONNECT_WAY:Ljava/lang/String; = "key_temp_connect_way"

.field private static final KEY_TEST_FILE_BROWSE:Ljava/lang/String; = "key_test_file_browse"

.field private static final KEY_TEST_FILE_TRANSFER:Ljava/lang/String; = "key_test_file_transfer"

.field private static final KEY_TEST_MESSAGE_SYNC:Ljava/lang/String; = "key_test_message_sync"

.field private static final KEY_TEST_OTA:Ljava/lang/String; = "key_test_ota"

.field private static final KEY_TEST_SMALL_FILE_TRANSFER:Ljava/lang/String; = "key_test_small_file_transfer"

.field private static final KEY_TEST_WATCH_OP:Ljava/lang/String; = "key_test_watch_op"

.field private static final KEY_USE_DEVICE_AUTH:Ljava/lang/String; = "key_use_device_auth"

.field private static volatile instance:Lcom/jieli/watchtesttool/tool/config/ConfigHelper;


# instance fields
.field private final preferences:Landroid/content/SharedPreferences;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "watch_config_data"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/jieli/watchtesttool/tool/config/ConfigHelper;
    .locals 2

    sget-object v0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->instance:Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->instance:Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    invoke-direct {v1, p0}, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->instance:Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->instance:Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    return-object p0
.end method


# virtual methods
.method public getAdvFilterPrefix()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_adv_filter_prefix"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBleMtu()I
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_adjust_ble_mtu"

    const/16 v2, 0x1fd

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getPreferences()Landroid/content/SharedPreferences;
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public getTempConnectWay()I
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_temp_connect_way"

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public isBanAutoTest()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_ban_auto_test"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isFilterDevice()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_filter_device"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isSPPConnectWay()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_spp_connect_way"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isTestFileBrowse()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_test_file_browse"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isTestFileTransfer()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_test_file_transfer"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isTestMessageSync()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_test_message_sync"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isTestOTA()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_test_ota"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isTestSmallFileTransfer()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_test_small_file_transfer"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isTestWatchOp()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_test_watch_op"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isUseDeviceAuth()Z
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "key_use_device_auth"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public setAdvFilterPrefix(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_adv_filter_prefix"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setBanAutoTest(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_ban_auto_test"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setBleMtu(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x14L
            to = 0x202L
        .end annotation
    .end param

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_adjust_ble_mtu"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setFilterDevice(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_filter_device"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setSppConnectWay(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_spp_connect_way"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setTempConnectWay(I)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_temp_connect_way"

    if-gez p1, :cond_0

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setTestFileBrowse(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_test_file_browse"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setTestFileTransfer(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_test_file_transfer"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setTestMessageSync(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_test_message_sync"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setTestOTA(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_test_ota"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setTestSmallFileTransfer(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_test_small_file_transfer"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setTestWatchOp(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_test_watch_op"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setUseDeviceAuth(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_use_device_auth"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
