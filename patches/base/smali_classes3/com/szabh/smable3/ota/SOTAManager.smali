.class public final Lcom/szabh/smable3/ota/SOTAManager;
.super Lcom/android/mltcode/paycertificationapi/iX0X;
.source "SourceFile"


# instance fields
.field public final I0IIOi:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Landroid/content/ServiceConnection;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public IiI10X:Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final O00:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public OIX0iXi:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public OIi0:Z

.field public XOO0ii0:Lcom/sifli/siflidfu/ISifliDFUService;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/zc1;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/zc1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iX0X;-><init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/zc1;)V

    const-string p1, "SOTAManager"

    iput-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager;->O00:Ljava/lang/String;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/hs3;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/hs3;-><init>(Lcom/szabh/smable3/ota/SOTAManager;)V

    invoke-static {p1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager;->I0IIOi:Lkotlin/Lazy;

    new-instance p1, Lcom/szabh/smable3/ota/SOTAManager$OXO1;

    invoke-direct {p1, p0}, Lcom/szabh/smable3/ota/SOTAManager$OXO1;-><init>(Lcom/szabh/smable3/ota/SOTAManager;)V

    iput-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager;->IO:Landroid/content/ServiceConnection;

    invoke-virtual {p0}, Lcom/szabh/smable3/ota/SOTAManager;->XiOIii1()V

    return-void
.end method

.method public static final synthetic I1XOi1(Lcom/szabh/smable3/ota/SOTAManager;Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;)V
    .locals 0

    iput-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager;->IiI10X:Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;

    return-void
.end method

.method public static final synthetic IIX1OXO(Lcom/szabh/smable3/ota/SOTAManager;Lcom/sifli/siflidfu/ISifliDFUService;)V
    .locals 0

    iput-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager;->XOO0ii0:Lcom/sifli/siflidfu/ISifliDFUService;

    return-void
.end method

.method public static final synthetic O10IXXX0X(Lcom/szabh/smable3/ota/SOTAManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/szabh/smable3/ota/SOTAManager;->O00:Ljava/lang/String;

    return-object p0
.end method

.method private final OII()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/szabh/smable3/ota/SOTAManager;->O00:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " start ota process"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/szabh/smable3/ota/SOTAManager;->OIX0iXi:Ljava/lang/String;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ZipUtils;->unzipFile(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/szabh/smable3/ota/SOTAManager;->iIiiO(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v4

    iget-object v1, p0, Lcom/szabh/smable3/ota/SOTAManager;->XOO0ii0:Lcom/sifli/siflidfu/ISifliDFUService;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX0X;->iO()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX0X;->XIi00iiXO()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-interface/range {v1 .. v6}, Lcom/sifli/siflidfu/ISifliDFUService;->startActionDFUNorExt(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;II)V

    :cond_0
    return-void
.end method

.method public static final OiIIX101O(Lcom/szabh/smable3/ota/SOTAManager;)Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;
    .locals 1

    new-instance v0, Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;

    invoke-direct {v0, p0}, Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;-><init>(Lcom/szabh/smable3/ota/SOTAManager;)V

    return-object v0
.end method

.method public static final synthetic X0O(Lcom/szabh/smable3/ota/SOTAManager;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/szabh/smable3/ota/SOTAManager;->OIi0:Z

    return-void
.end method

.method public static final synthetic X1ii(Lcom/szabh/smable3/ota/SOTAManager;)Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;
    .locals 0

    iget-object p0, p0, Lcom/szabh/smable3/ota/SOTAManager;->IiI10X:Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;

    return-object p0
.end method

.method public static synthetic XXI(Lcom/szabh/smable3/ota/SOTAManager;)Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;
    .locals 0

    invoke-static {p0}, Lcom/szabh/smable3/ota/SOTAManager;->OiIIX101O(Lcom/szabh/smable3/ota/SOTAManager;)Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic XiOIO(Lcom/szabh/smable3/ota/SOTAManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/szabh/smable3/ota/SOTAManager;->OII()V

    return-void
.end method


# virtual methods
.method public O00()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/szabh/smable3/ota/SOTAManager;->O00:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " release ota"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX0X;->iO()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/szabh/smable3/ota/SOTAManager;->XX0()Landroid/content/BroadcastReceiver;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-boolean v0, p0, Lcom/szabh/smable3/ota/SOTAManager;->OIi0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX0X;->iO()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/szabh/smable3/ota/SOTAManager;->IO:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/szabh/smable3/ota/SOTAManager;->OIi0:Z

    :cond_0
    return-void
.end method

.method public OIi0(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string p3, "filePath"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/szabh/smable3/ota/SOTAManager;->O00:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " startOTA -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/szabh/smable3/ota/SOTAManager;->OIi0:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager;->OIX0iXi:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p2}, Lcom/android/mltcode/paycertificationapi/iX0X;->IiI10X(Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/android/mltcode/paycertificationapi/iX0X;->I0iXXO(Lcom/android/mltcode/paycertificationapi/iX0X;ILjava/lang/String;DILjava/lang/Object;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX0X;->iO()Landroid/content/Context;

    move-result-object p2

    const-class p3, Lcom/sifli/siflidfu/SifliDFUService;

    invoke-direct {p1, p2, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX0X;->iO()Landroid/content/Context;

    move-result-object p2

    iget-object p3, v0, Lcom/szabh/smable3/ota/SOTAManager;->IO:Landroid/content/ServiceConnection;

    invoke-virtual {p2, p1, p3, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method

.method public final XX0()Landroid/content/BroadcastReceiver;
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/ota/SOTAManager;->I0IIOi:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/BroadcastReceiver;

    return-object v0
.end method

.method public final XiOIii1()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/szabh/smable3/ota/SOTAManager;->O00:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " registerDfuLocalBroadcast"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.sifli.siflidfu.BROADCAST_DFU_LOG"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.sifli.siflidfu.BROADCAST_DFU_STATE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.sifli.siflidfu.EXTRA_BROADCAST_PROGRESS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX0X;->iO()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    move-result-object v1

    invoke-virtual {p0}, Lcom/szabh/smable3/ota/SOTAManager;->XX0()Landroid/content/BroadcastReceiver;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final iIiiO(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/sifli/siflidfu/DFUImagePath;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getDFUImagePath  path="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ",scheme="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const/16 v3, -0x14d

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v4, "otaroot.bin"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x5

    goto :goto_2

    :sswitch_1
    const-string v4, "otaRes.bin"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x3

    goto :goto_2

    :sswitch_2
    const-string v4, "ctrl_packet.bin"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, -0x1

    goto :goto_2

    :sswitch_3
    const-string v4, "otaApp.bin"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    goto :goto_2

    :sswitch_4
    const-string v4, "otaFont.bin"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x4

    goto :goto_2

    :cond_6
    :goto_1
    move v1, v3

    :goto_2
    if-eq v1, v3, :cond_0

    new-instance v3, Lcom/sifli/siflidfu/DFUImagePath;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2, v1}, Lcom/sifli/siflidfu/DFUImagePath;-><init>(Ljava/lang/String;Landroid/net/Uri;I)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x780d15dc -> :sswitch_4
        -0x54ff2702 -> :sswitch_3
        -0x284c5f0b -> :sswitch_2
        0x1bafbffd -> :sswitch_1
        0x645b7917 -> :sswitch_0
    .end sparse-switch
.end method
