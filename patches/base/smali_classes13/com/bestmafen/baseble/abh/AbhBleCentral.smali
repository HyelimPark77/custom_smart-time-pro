.class public final Lcom/bestmafen/baseble/abh/AbhBleCentral;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1#2:303\n1869#3,2:304\n774#3:306\n865#3,2:307\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral\n*L\n246#1:304,2\n265#1:306\n265#1:307,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1#2:303\n1869#3,2:304\n774#3:306\n865#3,2:307\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral\n*L\n246#1:304,2\n265#1:306\n265#1:307,2\n*E\n"
    }
.end annotation


# static fields
.field public static I0IIOi:I

.field public static final I0iXXO:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static IO:I

.field public static IiI10X:I

.field public static final O00:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final O10IXXX0X:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final OIX0iXi:Lcom/bestmafen/baseble/abh/AbhBleCentral$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static OIi0:I

.field public static final OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final X1ii:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/lang/String;

.field public static final XO0O10:Landroid/bluetooth/BluetoothAdapter;

.field public static XOO0ii0:I

.field public static final XXI:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static iO:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-direct {v0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;-><init>()V

    sput-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XIi00iiXO:Ljava/lang/String;

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XO0O10:Landroid/bluetooth/BluetoothAdapter;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O00:Landroid/os/Handler;

    const/4 v0, 0x5

    sput v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I0IIOi:I

    const/16 v0, 0x1e

    sput v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIi0:I

    const/16 v0, 0xc

    sput v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IO:I

    new-instance v0, Lcom/bestmafen/baseble/abh/AbhBleCentral$OXO1;

    invoke-direct {v0}, Lcom/bestmafen/baseble/abh/AbhBleCentral$OXO1;-><init>()V

    sput-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIX0iXi:Lcom/bestmafen/baseble/abh/AbhBleCentral$OXO1;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiXI1OiX0;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/OiXI1OiX0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I0iXXO:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIX;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/IIX;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XXI:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX00XX;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/XX00XX;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X1ii:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXOII;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/iXOII;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O10IXXX0X:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic I0IIOi()I
    .locals 1

    sget v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IiI10X:I

    return v0
.end method

.method public static final synthetic I0iXXO()I
    .locals 1

    sget v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I0IIOi:I

    return v0
.end method

.method public static synthetic I1()V
    .locals 0

    return-void
.end method

.method public static final synthetic I1XOi1()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XIi00iiXO:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic IIX1OXO(Lcom/bestmafen/baseble/abh/AbhBleCentral;)V
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iX()V

    return-void
.end method

.method public static final synthetic IO()Landroid/os/Handler;
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O00:Landroid/os/Handler;

    return-object v0
.end method

.method public static final synthetic IiI10X(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XX0()Z

    move-result p0

    return p0
.end method

.method public static synthetic O00()Lcom/android/mltcode/paycertificationapi/X0100I;
    .locals 1

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O1O()Lcom/android/mltcode/paycertificationapi/X0100I;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic O10IXXX0X()I
    .locals 1

    sget v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IO:I

    return v0
.end method

.method public static final O1O()Lcom/android/mltcode/paycertificationapi/X0100I;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0100I;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/X0100I;-><init>()V

    return-object v0
.end method

.method public static final synthetic OIX0iXi(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic OIi0()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iO:Landroid/content/Context;

    return-object v0
.end method

.method public static synthetic OXO1()V
    .locals 0

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XXX11i()V

    return-void
.end method

.method public static final synthetic X0O(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->i010I()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic X1ii()I
    .locals 1

    sget v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XOO0ii0:I

    return v0
.end method

.method public static synthetic XIi00iiXO()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iX1O1()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic XO0O10()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XXIIO1i11()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic XOO0ii0()Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XO0O10:Landroid/bluetooth/BluetoothAdapter;

    return-object v0
.end method

.method public static final synthetic XXI()I
    .locals 1

    sget v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIi0:I

    return v0
.end method

.method public static final XXIIO1i11()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object v0
.end method

.method public static final XXX11i()V
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iX()V

    return-void
.end method

.method public static final synthetic XiOIO(I)V
    .locals 0

    sput p0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IiI10X:I

    return-void
.end method

.method public static final iI()Lcom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1;
    .locals 1

    new-instance v0, Lcom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1;

    invoke-direct {v0}, Lcom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1;-><init>()V

    return-object v0
.end method

.method public static final synthetic iIiiO(I)V
    .locals 0

    sput p0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XOO0ii0:I

    return-void
.end method

.method public static synthetic iO()Lcom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1;
    .locals 1

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iI()Lcom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1;

    move-result-object v0

    return-object v0
.end method

.method public static final iX1O1()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ut3;->OXO1:Lcom/android/mltcode/paycertificationapi/ut3;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/ut3;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/ut3;[Ljava/util/UUID;Lcom/bestmafen/baseble/scanner/ScanMode;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    sget-object v1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OX()Lcom/android/mltcode/paycertificationapi/X0100I;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XiOIO(Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->iIiiO(Z)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/bestmafen/baseble/abh/AbhBleCentral$XIi00iiXO;

    invoke-direct {v1}, Lcom/bestmafen/baseble/abh/AbhBleCentral$XIi00iiXO;-><init>()V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->X1ii(Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final II1Xi0()Lcom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1;
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X1ii:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1;

    return-object v0
.end method

.method public final IXXOO(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getApplicationContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iO:Landroid/content/Context;

    if-nez p1, :cond_0

    const-string p1, "mContext"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->II1Xi0()Lcom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1;

    move-result-object v0

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2}, Landroidx/core/content/ContextCompat;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    return-void
.end method

.method public final OII(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/IIII0iI;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    return-object p1
.end method

.method public final OX()Lcom/android/mltcode/paycertificationapi/X0100I;
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I0iXXO:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X0100I;

    return-object v0
.end method

.method public final OiIIX101O(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->X0O()V

    :cond_0
    return-void
.end method

.method public final X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/android/mltcode/paycertificationapi/IIII0iI;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O10IXXX0X:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public final declared-synchronized X0i1O(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/mltcode/paycertificationapi/IIII0iI;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XX0()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IiI10X:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->X0i1O(I)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    sput v1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IiI10X:I

    const/4 p1, 0x0

    sput p1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XOO0ii0:I

    sget-object p1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O00:Landroid/os/Handler;

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIX0iXi:Lcom/bestmafen/baseble/abh/AbhBleCentral$OXO1;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final X11iII1O1(Lcom/android/mltcode/paycertificationapi/IIII0iI;)V
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/IIII0iI;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "peripheral"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->OII()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->OII()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    sget-object p1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O00:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii00OXXO;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/ii00OXXO;-><init>()V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final X1IX(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/iOIIiI1;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/iOIIiI1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writeMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/iOIIiI1;)V

    :cond_0
    return-void
.end method

.method public final XX0()Z
    .locals 5

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XO0O10:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XIi00iiXO:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " canConnect -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", BluetoothAdapter isEnabled: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return v1
.end method

.method public final XiOIii1(Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->O10IXXX0X(Z)V

    :cond_0
    return-void
.end method

.method public final i010I()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XXI:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object v0
.end method

.method public final declared-synchronized iIXi1iiXI()V
    .locals 3

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IiI10X:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    sput v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IiI10X:I

    sget-object v1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O00:Landroid/os/Handler;

    sget-object v2, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIX0iXi:Lcom/bestmafen/baseble/abh/AbhBleCentral$OXO1;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->i010I()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final iOO1ii1(Lcom/android/mltcode/paycertificationapi/IIII0iI;)V
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/IIII0iI;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "peripheral"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->IIX1OXO()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iXiX011(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->IIX1OXO()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->I0iXXO()V

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    sput v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XOO0ii0:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OX()Lcom/android/mltcode/paycertificationapi/X0100I;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->IIX1OXO()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/X0100I;->XIi00iiXO(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iX()V

    return-void
.end method

.method public final iOOX010X()Ljava/util/Collection;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/android/mltcode/paycertificationapi/IIII0iI;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final declared-synchronized iX()V
    .locals 5

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->I1XOi1()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->OII()I

    move-result v3

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iIXi1iiXI()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X0i1O(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final iXiX011(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X01IiOiIi()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->iX1O1()V

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OX()Lcom/android/mltcode/paycertificationapi/X0100I;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/X0100I;->iO(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iX()V

    return-void
.end method
