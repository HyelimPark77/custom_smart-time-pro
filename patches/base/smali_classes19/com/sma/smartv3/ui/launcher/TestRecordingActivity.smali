.class public Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x17
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;
    }
.end annotation


# instance fields
.field private audioManager:Landroid/media/AudioManager;

.field chatOutputText:Landroid/widget/TextView;

.field handler:Landroid/os/Handler;

.field private isRecording:Z

.field isrun:Z

.field private mAudioRecord:Landroid/media/AudioRecord;

.field private mBufferSize:I

.field private mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

.field outputFile:Ljava/io/File;

.field private final rtAsrApiKey:Ljava/lang/String;

.field scoStateReceiver:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;

.field private targetAudioDevice:Landroid/media/AudioDeviceInfo;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const-string v0, "0c997b55309fdb251dcb1b8cc6c87959"

    iput-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->rtAsrApiKey:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isRecording:Z

    new-instance v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;Lcom/android/mltcode/paycertificationapi/vo5;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->scoStateReceiver:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->handler:Landroid/os/Handler;

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isrun:Z

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/files/recorddemo.pcm"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->outputFile:Ljava/io/File;

    return-void
.end method

.method public static bridge synthetic I0iXXO(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isRecording:Z

    return p0
.end method

.method public static bridge synthetic I1XOi1(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->startRecording()V

    return-void
.end method

.method public static bridge synthetic IIX1OXO(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->stopRecording()V

    return-void
.end method

.method public static bridge synthetic O10IXXX0X(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->closeBluetooth()V

    return-void
.end method

.method public static bridge synthetic OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->audioManager:Landroid/media/AudioManager;

    return-object p0
.end method

.method public static bridge synthetic X0O(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->start()V

    return-void
.end method

.method public static bridge synthetic X1ii(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mBufferSize:I

    return p0
.end method

.method public static bridge synthetic XXI(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioRecord;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mAudioRecord:Landroid/media/AudioRecord;

    return-object p0
.end method

.method public static bridge synthetic XiOIO(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->testRtasr2()V

    return-void
.end method

.method private closeBluetooth()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V

    return-void
.end method

.method private initSDK()I
    .locals 2

    new-instance v0, Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    const-string v1, "0c997b55309fdb251dcb1b8cc6c87959"

    invoke-direct {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    new-instance v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->registerCallbacks(Lcom/iflytek/sparkchain/core/rtasr/RTASRCallbacks;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    const-string v1, "normal"

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->transType(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    const-string v1, "cn"

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->lang(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    const-string v1, "en"

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->targetLang(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    const-string v1, "xdx"

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->start(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method private initSDK2()V
    .locals 0

    return-void
.end method

.method private initialRecorder()V
    .locals 7

    const/16 v0, 0x10

    const/4 v1, 0x2

    const/16 v2, 0x3e80

    invoke-static {v2, v0, v1}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mBufferSize:I

    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u6ca1\u6709\u5f55\u97f3\u6743\u9650"

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    new-instance v1, Landroid/media/AudioRecord;

    const/4 v5, 0x2

    iget v6, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mBufferSize:I

    const/4 v2, 0x0

    const/16 v3, 0x3e80

    const/16 v4, 0x10

    invoke-direct/range {v1 .. v6}, Landroid/media/AudioRecord;-><init>(IIIII)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mAudioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v1}, Landroid/media/AudioRecord;->getState()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "AudioRecord"

    if-eq v0, v1, :cond_1

    const-string v0, "Initialization failed."

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string v0, "Initialized successfully."

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private listener()V
    .locals 3

    const v0, 0x7f0a0b1d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0b8b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0b8c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$iO;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->scoStateReceiver:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;

    const/4 v2, 0x2

    invoke-static {p0, v1, v0, v2}, Landroidx/core/content/ContextCompat;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    return-void

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->scoStateReceiver:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private setStartBluetooth()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getMode \u5f53\u524d\u7684\u6570\u636e\u662f 111:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v1}, Landroid/media/AudioManager;->getMode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "   Build.BRAND = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  ,  Build.VERSION.SDK_INT  = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SparkChain"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private start()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->setStartBluetooth()V

    return-void
.end method

.method private startRecording()V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isRecording:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isRecording:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "111111111111111111 isRecording  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isRecording:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SparkChain"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->initialRecorder()V

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method private stopRecording()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isRecording:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isRecording:Z

    :cond_0
    return-void
.end method

.method private testRtasr([BI)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bytes",
            "mBufferSize"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->initSDK()I

    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-array p1, p2, [B

    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p2

    const/4 v1, -0x1

    if-eq v1, p2, :cond_2

    if-lez p2, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-virtual {p2, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->write([B)I

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private testRtasr2()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XOO0ii0;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XOO0ii0;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isrun:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isrun:Z

    new-instance v0, Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    const-string v1, "0c997b55309fdb251dcb1b8cc6c87959"

    invoke-direct {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    new-instance v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->registerCallbacks(Lcom/iflytek/sparkchain/core/rtasr/RTASRCallbacks;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    const-string v1, "normal"

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->transType(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    const-string v1, "cn"

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->lang(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    const-string v1, "tag"

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->start(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_3

    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->outputFile:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/16 v1, 0x140

    new-array v1, v1, [B

    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v3, v2, :cond_2

    if-lez v2, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-virtual {v2, v3}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->write([B)I

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->mRTASR:Lcom/iflytek/sparkchain/core/rtasr/RTASR;

    invoke-virtual {v0}, Lcom/iflytek/sparkchain/core/rtasr/RTASR;->stop()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public init()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->listener()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "savedInstanceState"
        }
    .end annotation

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d010d

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    const p1, 0x7f0a0228

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->initSDK2()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->init()V

    const-string p1, "audio"

    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->audioManager:Landroid/media/AudioManager;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v3

    const/4 v4, 0x7

    if-ne v3, v4, :cond_0

    iput-object v2, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->targetAudioDevice:Landroid/media/AudioDeviceInfo;

    :cond_0
    iget-object v3, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "\n  \u5f53\u524d\u7684\u97f3\u9891\u8f93\u5165\u8bbe\u5907 type =>  "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "  id =   "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getId()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->scoStateReceiver:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public playUri(Landroid/net/Uri;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "uri"
        }
    .end annotation

    return-void
.end method
