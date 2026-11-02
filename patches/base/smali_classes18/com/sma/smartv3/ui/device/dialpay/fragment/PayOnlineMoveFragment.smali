.class public Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;,
        Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment<",
        "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPayOnlineMoveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,603:1\n1#2:604\n1#2:613\n90#3:605\n99#4,7:606\n106#4,3:614\n79#4,7:617\n109#4:624\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment\n*L\n308#1:613\n289#1:605\n308#1:606,7\n308#1:614,3\n308#1:617,7\n308#1:624\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPayOnlineMoveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,603:1\n1#2:604\n1#2:613\n90#3:605\n99#4,7:606\n106#4,3:614\n79#4,7:617\n109#4:624\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment\n*L\n308#1:613\n289#1:605\n308#1:606,7\n308#1:614,3\n308#1:617,7\n308#1:624\n*E\n"
    }
.end annotation


# instance fields
.field private dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isNeedPayDialog:Z

.field private mBinFileName:Ljava/lang/String;

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurItem:Lcom/sma/smartv3/model/WatchFaceCategoryV2;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mCurProgressButton:Lcom/sma/smartv3/view/ProgressButtonV2;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
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

.field private mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private orderNum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final recyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTipView$delegate:Lkotlin/Lazy;
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hp1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->recyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ip1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ip1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->tvView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jp1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->tvTipView$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->DEFAULT:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mDialIds:Ljava/util/List;

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->NO_SYNC:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->orderNum:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$XIi00iiXO;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->initItem$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->showPayConfirm$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILcom/sma/smartv3/view/ProgressButtonV2;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->initItem$lambda$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILcom/sma/smartv3/view/ProgressButtonV2;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->tvTipView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->tvView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->recyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCount(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)I
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getCount()I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getDialPickerPopup$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    return-object p0
.end method

.method public static final synthetic access$getMActivity(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMBinFileName$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mBinFileName:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncDevicePosition:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncDialId:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncPosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncPosition:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Lcom/sma/smartv3/model/SyncStatus;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    return-object p0
.end method

.method public static final synthetic access$getMDialIds$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mDialIds:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMRecyclerAdapter(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sendDial(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->sendDial()V

    return-void
.end method

.method public static final synthetic access$setDialPickerPopup$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    return-void
.end method

.method public static final synthetic access$setMCurSyncCompleted$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncCompleted:I

    return-void
.end method

.method public static final synthetic access$setMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncDevicePosition:I

    return-void
.end method

.method public static final synthetic access$setMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncDialId:I

    return-void
.end method

.method public static final synthetic access$setMCurSyncPosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncPosition:I

    return-void
.end method

.method public static final synthetic access$setMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    return-void
.end method

.method public static final synthetic access$setMCurSyncTotal$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncTotal:I

    return-void
.end method

.method public static final synthetic access$syncDial(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IIILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->syncDial(IIILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    return-void
.end method

.method public static final synthetic access$syncStatusChange(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->syncStatusChange(Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/SyncStatus;)V

    return-void
.end method

.method private static final getOrderStatus$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Z)Lkotlin/Unit;
    .locals 6

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurProgressButton:Lcom/sma/smartv3/view/ProgressButtonV2;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurItem:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    if-eqz p1, :cond_1

    const p1, 0x7f1410b1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncDialId:I

    iget v2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncPosition:I

    iget v3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncDevicePosition:I

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurProgressButton:Lcom/sma/smartv3/view/ProgressButtonV2;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurItem:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->syncDial(IIILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    goto :goto_0

    :cond_1
    const p0, 0x7f1410a9

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getTvTipView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->tvTipView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getOrderStatus$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initItem$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v1, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "mArg1"

    invoke-virtual {v1, p2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "mArg2"

    const/4 v0, 0x0

    invoke-virtual {v1, p2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "mArg3"

    invoke-virtual {v1, p2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    const-class v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initItem$lambda$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILcom/sma/smartv3/view/ProgressButtonV2;Landroid/view/View;)V
    .locals 8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isSync()Z

    move-result p5

    if-eqz p5, :cond_0

    const p0, 0x7f1412fe

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    iget-object p5, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mDialIds:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_1

    const p0, 0x7f140440

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;

    const/4 v7, 0x0

    move-object v2, p0

    move v4, p1

    move-object v3, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;IILcom/sma/smartv3/view/ProgressButtonV2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private static final recyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroidx/recyclerview/widget/RecyclerView;
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

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->SYNCING:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WATCHFACE_ID:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget v5, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncDialId:I

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt32$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/nio/ByteOrder;ZZILjava/lang/Object;)Z

    return-void

    :cond_0
    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->WATCH_FACE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mBinFileName:Ljava/lang/String;

    if-nez v4, :cond_1

    const-string v4, "mBinFileName"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_1
    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/uz0;->O00(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    iget v4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncDevicePosition:I

    invoke-virtual {v1, v2, v3, v4}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/File;I)Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XO10X()V

    return-void
.end method

.method private final showPayConfirm()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f1410b3

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v4, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mp1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/mp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V

    const v2, 0x7f14162a

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private static final showPayConfirm$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getOrderStatus()V

    const/4 p0, 0x1

    return p0
.end method

.method private final syncDial(IIILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/WatchFaceManager;

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncDial -> mCurSyncPosition:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " mCurSyncDialId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v1, Lcom/sma/smartv3/model/SyncStatus;->DOWNLOAD:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p5 .. p5}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ".bin"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mBinFileName:Ljava/lang/String;

    new-instance v3, Ljava/io/File;

    sget-object v4, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v5

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mBinFileName:Ljava/lang/String;

    const/4 v7, 0x0

    const-string v8, "mBinFileName"

    if-nez v6, :cond_0

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v7

    :cond_0
    invoke-direct {v3, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p5 .. p5}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v6, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    invoke-virtual/range {p5 .. p5}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v5, v1, v2}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z

    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mBinFileName:Ljava/lang/String;

    if-nez v2, :cond_2

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v7, v2

    :goto_0
    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->getSize(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syncDial -> dial try get from dialFile file = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " size:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/16 v10, 0x3e

    const/4 v11, 0x0

    const v4, 0x7f1412fd

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v3, p4

    invoke-static/range {v3 .. v11}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->sendDial()V

    return-void

    :cond_3
    const/16 v19, 0x3e

    const/16 v20, 0x0

    const v13, 0x7f140476

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v12, p4

    invoke-static/range {v12 .. v20}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual/range {p5 .. p5}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getBinUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getAbsolutePath(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mBinFileName:Ljava/lang/String;

    if-nez v5, :cond_4

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v7, v5

    :goto_1
    new-instance v5, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;

    move-object/from16 v12, p4

    move-object/from16 v6, p5

    invoke-direct {v5, v6, v3, v12, v0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;-><init>(Lcom/sma/smartv3/model/WatchFaceCategoryV2;Ljava/io/File;Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V

    invoke-virtual {v1, v2, v4, v7, v5}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method private final syncStatusChange(Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$OXO1;->OXO1:[I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    return-void

    :cond_0
    const/16 v10, 0x3c

    const/4 v11, 0x0

    const v4, 0x7f1412fb

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v11}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_1
    iget v1, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncCompleted:I

    int-to-float v1, v1

    iget v2, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncTotal:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    move-object/from16 v12, p1

    invoke-virtual {v12, v1}, Lcom/sma/smartv3/view/ProgressButtonV2;->setProgressDecimalPlaces(F)V

    return-void

    :cond_2
    move-object/from16 v12, p1

    const/16 v19, 0x3a

    const/16 v20, 0x0

    const v13, 0x7f1412f6

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v12 .. v20}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_3
    const/16 v19, 0x3e

    const/16 v20, 0x0

    const v13, 0x7f1412f9

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v20}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final tvTipView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a1895

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/widget/TextView;
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
.method public final getMCurItem()Lcom/sma/smartv3/model/WatchFaceCategoryV2;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurItem:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    return-object v0
.end method

.method public final getMCurProgressButton()Lcom/sma/smartv3/view/ProgressButtonV2;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurProgressButton:Lcom/sma/smartv3/view/ProgressButtonV2;

    return-object v0
.end method

.method public final getOrderNum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->orderNum:Ljava/lang/String;

    return-object v0
.end method

.method public final getOrderStatus()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->orderNum:Ljava/lang/String;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/gp1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/gp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V

    const-string v3, "WatchFace"

    invoke-virtual {v0, v1, v3, v2}, Lcom/sma/smartv3/biz/OrderManager;->XX0(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->recyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final getTvView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->tvView$delegate:Lkotlin/Lazy;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$XIi00iiXO;

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

    const-string v3, "WATCHFACE_LIST_V2"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, [Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/WatchFaceCategoryV2;

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
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getTvView()Landroid/widget/TextView;

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
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getTvView()Landroid/widget/TextView;

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

.method public initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V
    .locals 17
    .param p1    # Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/WatchFaceCategoryV2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    move-object/from16 v3, p2

    const-string v0, "holder"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v2

    const v0, 0x7f0a05fc

    .line 3
    invoke-virtual {v6, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/SquareImageView;

    .line 4
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v4

    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 5
    new-instance v4, Lcom/android/mltcode/paycertificationapi/kp1;

    invoke-direct {v4, v1, v3}, Lcom/android/mltcode/paycertificationapi/kp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v7, 0x7f0a08f9

    .line 6
    invoke-virtual {v6, v7}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/sma/smartv3/view/ProgressButtonV2;

    .line 7
    iget-object v0, v1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    sget-object v4, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->BUY_HISTORY:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    const v5, 0x7f0a08fa

    if-ne v0, v4, :cond_1

    .line 8
    invoke-virtual {v6, v5}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    .line 9
    sget-object v4, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/i72;->OX()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollar()F

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmount()F

    move-result v4

    :goto_0
    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static {v4, v10, v9, v10}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const v0, 0x7f0a0582

    .line 10
    invoke-virtual {v6, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getNewFlag()Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/i72;->X1i()Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    const/16 v4, 0x8

    :goto_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 11
    :cond_3
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollar()F

    move-result v9

    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmount()F

    move-result v10

    .line 12
    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollarDis()F

    move-result v11

    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmountDis()F

    move-result v12

    .line 13
    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getLimitFreeFlag()Z

    move-result v13

    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getMemberAttr()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPayStatus()Ljava/lang/String;

    move-result-object v15

    .line 14
    invoke-static/range {v8 .. v15}, Lcom/android/mltcode/paycertificationapi/XXiO;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;FFFFZLjava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v0, v1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    sget-object v4, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->VIP_FREE:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    if-ne v0, v4, :cond_6

    const v0, 0x7f0a0638

    .line 16
    invoke-virtual {v6, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 17
    invoke-virtual {v6, v5}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/view/text/PFMedium;

    .line 18
    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getLimitFreeFlag()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 19
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v5

    const v9, 0x7f08142c

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v5, v9}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const v0, 0x7f140c09

    .line 20
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 21
    :cond_4
    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getMemberAttr()Ljava/lang/String;

    move-result-object v5

    const-string v9, "1"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 22
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v5

    const v9, 0x7f081500

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v5, v9}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const v0, 0x7f140443

    .line 23
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_2
    const/16 v15, 0x3a

    const/16 v16, 0x0

    const v9, 0x7f1412f6

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 24
    invoke-static/range {v8 .. v16}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    .line 25
    :cond_6
    iget v0, v1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncDialId:I

    if-ne v0, v2, :cond_7

    .line 26
    iget-object v0, v1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    invoke-direct {v1, v8, v0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->syncStatusChange(Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/SyncStatus;)V

    goto :goto_3

    .line 27
    :cond_7
    iget-object v0, v1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mDialIds:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v15, 0x3c

    const/16 v16, 0x0

    const v9, 0x7f1412fb

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 28
    invoke-static/range {v8 .. v16}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    .line 29
    :cond_8
    :goto_3
    new-instance v0, Lcom/android/mltcode/paycertificationapi/lp1;

    move/from16 v4, p3

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/lp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;ILcom/sma/smartv3/model/WatchFaceCategoryV2;ILcom/sma/smartv3/view/ProgressButtonV2;)V

    invoke-virtual {v6, v7, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V

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
            "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg0()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1410b2

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->BUY_HISTORY:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    goto :goto_0

    :cond_0
    const v1, 0x7f140c08

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->VIP_FREE:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->DEFAULT:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    :goto_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getTvTipView()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    sget-object v2, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->DEFAULT:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    if-eq v1, v2, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getTvTipView()Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    sget-object v3, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->BUY_HISTORY:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    if-ne v2, v3, :cond_2

    const v2, 0x7f14113b

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const v2, 0x7f1414a7

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    const/16 v1, 0x8

    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->itemLayoutId()I

    move-result v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMList()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;

    invoke-direct {v3, p0, v0, v1, v2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Landroid/app/Activity;ILjava/util/List;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->setMRecyclerAdapter(Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->initAdapterList()V

    return-void
.end method

.method public final isNeedPayDialog()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isNeedPayDialog:Z

    return v0
.end method

.method public final isSync()Z
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

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
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isMoreActivity:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    sget-object v1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->BUY_HISTORY:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    if-ne v0, v1, :cond_0

    const v0, 0x7f0d0edc

    return v0

    :cond_0
    sget-object v1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;->VIP_FREE:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$MoveType;

    if-ne v0, v1, :cond_1

    const v0, 0x7f0d0edd

    return v0

    :cond_1
    const v0, 0x7f0d0eda

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e6f

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    return-void
.end method

.method public final onOrderPayStatusChange(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "ORDER_PAY_SUCCESS"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isNeedPayDialog:Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncPosition:I

    if-le p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMList()Ljava/util/List;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncPosition:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    const-string v0, "Payed"

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->setPayStatus(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurSyncPosition:I

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    const-string p1, "WATCH_FACE_PAY_LIST_CHANGE"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getOrderStatus()V

    return-void
.end method

.method public onResume()V
    .locals 10

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WATCHFACE_ID:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mDialIds:Ljava/util/List;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "syncId"

    invoke-virtual {v2, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mDialIds:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDialIds -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :goto_0
    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isNeedPayDialog:Z

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isNeedPayDialog:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->showPayConfirm()V

    :cond_1
    return-void
.end method

.method public final setMCurItem(Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/WatchFaceCategoryV2;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurItem:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    return-void
.end method

.method public final setMCurProgressButton(Lcom/sma/smartv3/view/ProgressButtonV2;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/ProgressButtonV2;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->mCurProgressButton:Lcom/sma/smartv3/view/ProgressButtonV2;

    return-void
.end method

.method public final setNeedPayDialog(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->isNeedPayDialog:Z

    return-void
.end method

.method public final setOrderNum(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->orderNum:Ljava/lang/String;

    return-void
.end method
