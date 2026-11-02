.class public Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment<",
        "Lcom/sma/smartv3/model/WatchFaceInfo;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialOnlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialOnlineFragment.kt\ncom/sma/smartv3/ui/device/dial/DialOnlineFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,410:1\n1#2:411\n90#3:412\n*S KotlinDebug\n*F\n+ 1 DialOnlineFragment.kt\ncom/sma/smartv3/ui/device/dial/DialOnlineFragment\n*L\n231#1:412\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialOnlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialOnlineFragment.kt\ncom/sma/smartv3/ui/device/dial/DialOnlineFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,410:1\n1#2:411\n90#3:412\n*S KotlinDebug\n*F\n+ 1 DialOnlineFragment.kt\ncom/sma/smartv3/ui/device/dial/DialOnlineFragment\n*L\n231#1:412\n*E\n"
    }
.end annotation


# instance fields
.field private dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBinFileName:Ljava/lang/String;

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurSyncCompleted:I

.field private mCurSyncDevicePosition:I

.field private mCurSyncDialId:I

.field private mCurSyncPosition:I

.field private mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurSyncTotal:I

.field private final mDialIds:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final recyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1XiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1XiO;-><init>(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->recyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXi0OIXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXi0OIXO;-><init>(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->tvView$delegate:Lkotlin/Lazy;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mDialIds:Ljava/util/List;

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->NO_SYNC:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$iO;-><init>(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$iO;

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->recyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->tvView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->initItem$lambda$0$0(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCount(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)I
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getCount()I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMBinFileName$p(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mBinFileName:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncDevicePosition:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncDialId:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncPosition$p(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncPosition:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Lcom/sma/smartv3/model/SyncStatus;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    return-object p0
.end method

.method public static final synthetic access$getMDialIds$p(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mDialIds:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMRecyclerAdapter(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sendDial(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->sendDial()V

    return-void
.end method

.method public static final synthetic access$setMCurSyncCompleted$p(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncCompleted:I

    return-void
.end method

.method public static final synthetic access$setMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    return-void
.end method

.method public static final synthetic access$setMCurSyncTotal$p(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncTotal:I

    return-void
.end method

.method public static final synthetic access$syncDial(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->syncDial(IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V

    return-void
.end method

.method public static final synthetic access$syncStatusChange(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;Lcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->syncStatusChange(Lcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/SyncStatus;)V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->initItem$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Landroid/view/View;)V

    return-void
.end method

.method private static final initItem$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Landroid/view/View;)V
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->isSync()Z

    move-result p5

    if-eqz p5, :cond_0

    const p0, 0x7f1412fe

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    iget-object p5, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mDialIds:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_1

    const p0, 0x7f140440

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0OXO010X;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/i0OXO010X;-><init>(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final initItem$lambda$0$0(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p5

    const-string v0, "null cannot be cast to non-null type com.bestmafen.androidbase.base.BaseActivity"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Lcom/bestmafen/androidbase/base/BaseActivity;

    invoke-virtual {p5}, Lcom/bestmafen/androidbase/base/BaseActivity;->disableOrientation()V

    sget-object p5, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p5}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result p5

    if-eqz p5, :cond_1

    iget-object p5, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    if-eqz p5, :cond_0

    invoke-virtual {p5}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p5

    const/4 v0, 0x1

    if-ne p5, v0, :cond_0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_0
    new-instance p5, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mDialIds:Ljava/util/List;

    new-instance v2, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;

    move-object v3, p0

    move v4, p1

    move v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V

    const/4 p0, 0x0

    invoke-direct {p5, v0, v1, p0, v2}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;-><init>(Landroid/app/Activity;Ljava/util/List;ILcom/android/mltcode/paycertificationapi/iXiIO0i;)V

    iput-object p5, v3, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    const-string p1, "<get-recyclerView>(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p5, p0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    move-object v3, p0

    move v4, p1

    move v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v8, v7

    move-object v7, v6

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->syncDial(IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final recyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0996

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final sendDial()V
    .locals 11

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->I1XOi1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->SYNCING:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WATCHFACE_ID:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget v5, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncDialId:I

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt32$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/nio/ByteOrder;ZZILjava/lang/Object;)Z

    return-void

    :cond_1
    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->WATCH_FACE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mBinFileName:Ljava/lang/String;

    if-nez v4, :cond_2

    const-string v4, "mBinFileName"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_2
    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/uz0;->O00(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    iget v4, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncDevicePosition:I

    invoke-virtual {v1, v2, v3, v4}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/File;I)Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XO10X()V

    return-void
.end method

.method private final syncDial(IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->O110i()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/WatchFaceManager;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syncDial -> mCurSyncPosition:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " mCurSyncDialId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iput p1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncDialId:I

    iput p2, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncPosition:I

    sget-object p1, Lcom/sma/smartv3/model/SyncStatus;->DOWNLOAD:Lcom/sma/smartv3/model/SyncStatus;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    iput p3, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncDevicePosition:I

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p5}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "_"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ".bin"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mBinFileName:Ljava/lang/String;

    new-instance p3, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mBinFileName:Ljava/lang/String;

    const-string v3, "mBinFileName"

    const/4 v4, 0x0

    if-nez v2, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_1
    invoke-direct {p3, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p5}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_2

    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    invoke-virtual {p5}, Lcom/sma/smartv3/model/WatchFaceInfo;->getPreviewPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, p2}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z

    :cond_2
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p1

    const/4 v1, 0x2

    if-eqz p1, :cond_4

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p5, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mBinFileName:Ljava/lang/String;

    if-nez p5, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p5, v4

    :cond_3
    invoke-static {p3}, Lcom/blankj/utilcode/util/FileUtils;->getSize(Ljava/io/File;)Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncDial -> dial try get from dialFile file = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p5, " size:"

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const p1, 0x7f1412fd

    invoke-static {p4, p1, p2, v1, v4}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->sendDial()V

    return-void

    :cond_4
    const p1, 0x7f140476

    invoke-static {p4, p1, p2, v1, v4}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/WatchFaceInfo;->getBinPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getAbsolutePath(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mBinFileName:Ljava/lang/String;

    if-nez v1, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v4, v1

    :goto_0
    new-instance v1, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$syncDial$1;

    invoke-direct {v1, p5, p3, p4, p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$syncDial$1;-><init>(Lcom/sma/smartv3/model/WatchFaceInfo;Ljava/io/File;Lcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)V

    invoke-virtual {p1, p2, v0, v4, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method private final syncStatusChange(Lcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$OXO1;->OXO1:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq p2, v2, :cond_3

    if-eq p2, v3, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    return-void

    :cond_0
    const p2, 0x7f1412fb

    invoke-virtual {p1, p2, v2}, Lcom/sma/smartv3/view/ProgressButton;->iO(IZ)V

    return-void

    :cond_1
    iget p2, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncCompleted:I

    int-to-float p2, p2

    iget v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncTotal:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->setProgressDecimalPlaces(F)V

    return-void

    :cond_2
    const p2, 0x7f1412f6

    invoke-static {p1, p2, v1, v3, v0}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void

    :cond_3
    const p2, 0x7f1412f9

    invoke-static {p1, p2, v1, v3, v0}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void
.end method

.method private static final tvView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18b3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->recyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final getTvView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->tvView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$iO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initAdapterList()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WATCHFACE_LIST"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, [Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/WatchFaceInfo;

    if-eqz v0, :cond_0

    array-length v1, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "list -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    array-length v3, v0

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->getTvView()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->XOO0XX([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->getTvView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->I1()V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceInfo;I)V
    .locals 7
    .param p1    # Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/WatchFaceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result v3

    const v0, 0x7f0a05fc

    .line 3
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/SquareImageView;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceInfo;->getPreviewPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const v0, 0x7f0a08f9

    .line 5
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/sma/smartv3/view/ProgressButton;

    .line 6
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v4, 0x7f1412f6

    const/4 v6, 0x0

    invoke-static {v5, v4, v6, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    .line 7
    iget v1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncDialId:I

    if-ne v1, v3, :cond_0

    .line 8
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    invoke-direct {p0, v5, v1}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->syncStatusChange(Lcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/SyncStatus;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mDialIds:Ljava/util/List;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f1412fb

    const/4 v2, 0x1

    .line 10
    invoke-virtual {v5, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->iO(IZ)V

    .line 11
    :cond_1
    :goto_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/XOIXX0iX;

    move-object v2, p0

    move-object v6, p2

    move v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/XOIXX0iX;-><init>(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V

    invoke-virtual {p1, v0, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceInfo;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WatchFaceInfo;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->itemLayoutId()I

    move-result v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMList()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$initView$1;

    invoke-direct {v3, p0, v0, v1, v2}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$initView$1;-><init>(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;Landroid/app/Activity;ILjava/util/List;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->setMRecyclerAdapter(Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->initAdapterList()V

    return-void
.end method

.method public final isSync()Z
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v1, Lcom/sma/smartv3/model/SyncStatus;->SYNCING:Lcom/sma/smartv3/model/SyncStatus;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/model/SyncStatus;->DOWNLOAD:Lcom/sma/smartv3/model/SyncStatus;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ed9

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e6f

    return v0
.end method

.method public final onAGPSSyncState(Z)V
    .locals 4
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "AGPS_SYNC_STATE"
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->isSync()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onAGPSSyncState -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->isSync()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->sendDial()V

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$iO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    return-void
.end method

.method public onResume()V
    .locals 9

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->WATCHFACE_ID:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mDialIds:Ljava/util/List;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "syncId"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->mDialIds:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mDialIds -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
