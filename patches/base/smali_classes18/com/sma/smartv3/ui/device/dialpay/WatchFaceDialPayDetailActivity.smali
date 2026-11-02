.class public final Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,865:1\n19#2:866\n15#2:867\n11#2,2:868\n19#2:889\n15#2:890\n11#2,2:891\n19#2:913\n15#2:914\n11#2,2:915\n87#3,7:870\n94#3,3:878\n70#3,7:881\n97#3:888\n87#3,7:893\n94#3,3:901\n70#3,7:904\n97#3:911\n1#4:877\n1#4:900\n1#4:912\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity\n*L\n323#1:866\n323#1:867\n324#1:868,2\n469#1:889\n469#1:890\n470#1:891,2\n604#1:913\n604#1:914\n605#1:915,2\n341#1:870,7\n341#1:878,3\n341#1:881,7\n341#1:888\n475#1:893,7\n475#1:901,3\n475#1:904,7\n475#1:911\n341#1:877\n475#1:900\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,865:1\n19#2:866\n15#2:867\n11#2,2:868\n19#2:889\n15#2:890\n11#2,2:891\n19#2:913\n15#2:914\n11#2,2:915\n87#3,7:870\n94#3,3:878\n70#3,7:881\n97#3:888\n87#3,7:893\n94#3,3:901\n70#3,7:904\n97#3:911\n1#4:877\n1#4:900\n1#4:912\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity\n*L\n323#1:866\n323#1:867\n324#1:868,2\n469#1:889\n469#1:890\n470#1:891,2\n604#1:913\n604#1:914\n605#1:915,2\n341#1:870,7\n341#1:878,3\n341#1:881,7\n341#1:888\n475#1:893,7\n475#1:901,3\n475#1:904,7\n475#1:911\n341#1:877\n475#1:900\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private binUrl:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dialIv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dialNew$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private isNeedPayDialog:Z

.field private isPaySuccess:Z

.field private mAmount:F

.field private mAmountMember:F

.field private mAmountOriginal:F

.field private mBinFileName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mConfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;
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

.field private mDialDiscount:Z

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

.field private mDialIsLimitFreeFlag:Z

.field private mDialIsVipFreeFlag:Z

.field private mDialMemberAttr:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDialType:I

.field private mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mItemPosition:I

.field private mLoginHintPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mNestedScrollView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mOpenMembership$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mOpenMembershipLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPayStatus:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mPrecautionsTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private orderNum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private previewUrl:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final progressButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAlsoLike$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAmount$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvLimitedFree$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvMemory$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/po6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/po6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vo6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->dialIv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wo6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zn6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zn6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->btnView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ao6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ao6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->progressButton$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bo6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->dialNew$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/co6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/co6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvAmount$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/do6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/do6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvMemory$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/eo6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/eo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvLimitedFree$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fo6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvAlsoLike$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qo6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ro6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ro6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mNestedScrollView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/so6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/so6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPrecautionsTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/to6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/to6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mOpenMembership$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uo6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mOpenMembershipLayout$delegate:Lkotlin/Lazy;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialMemberAttr:Ljava/lang/String;

    const-string v1, "WatchFaceDialPayDetailActivity"

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->TAG:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayStatus:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->previewUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->binUrl:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mItemPosition:I

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIds:Ljava/util/List;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBinFileName:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->orderNum:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->NO_SYNC:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$iO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->showPayConfirm$lambda$0$1(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;[Lcom/sma/smartv3/model/WatchFaceCategoryV2;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;[Lcom/sma/smartv3/model/WatchFaceCategoryV2;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->showPayConfirm$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mOpenMembershipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->btnView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->dialIv_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/AccountCreateOrder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->goCreateOrder$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/AccountCreateOrder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvMemory_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->dialNew_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->showLoginHint$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvAlsoLike_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroidx/core/widget/NestedScrollView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mNestedScrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroidx/core/widget/NestedScrollView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getOrderStatus$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/WatchFaceDetail;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getWatchFaceDetail$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/WatchFaceDetail;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPrecautionsTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->detailSyncDial$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static final synthetic access$getMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncDevicePosition:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncDialId:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/model/SyncStatus;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    return-object p0
.end method

.method public static final synthetic access$getMDialIds$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIds:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMDialIsLimitFreeFlag$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIsLimitFreeFlag:Z

    return p0
.end method

.method public static final synthetic access$getMDialIsVipFreeFlag$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIsVipFreeFlag:Z

    return p0
.end method

.method public static final synthetic access$getMDialMemberAttr$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialMemberAttr:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getProgressButton(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/ProgressButtonV2;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$goCreateOrder(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->goCreateOrder()V

    return-void
.end method

.method public static final synthetic access$handleErrorCode(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->handleErrorCode(I)V

    return-void
.end method

.method public static final synthetic access$initData(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->initData()V

    return-void
.end method

.method public static final synthetic access$isPaySuccess$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isPaySuccess:Z

    return p0
.end method

.method public static final synthetic access$sendDial(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->sendDial(Ljava/io/File;)V

    return-void
.end method

.method public static final synthetic access$setMCurSyncCompleted$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncCompleted:I

    return-void
.end method

.method public static final synthetic access$setMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    return-void
.end method

.method public static final synthetic access$setMCurSyncTotal$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncTotal:I

    return-void
.end method

.method public static final synthetic access$showLoginHint(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->showLoginHint()V

    return-void
.end method

.method public static final synthetic access$syncDial(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;IIILcom/sma/smartv3/view/ProgressButtonV2;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->syncDial(IIILcom/sma/smartv3/view/ProgressButtonV2;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$syncStatusChange(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->syncStatusChange(Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/SyncStatus;)V

    return-void
.end method

.method private static final btnView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0303

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final detailSyncDial$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "null cannot be cast to non-null type com.bestmafen.androidbase.base.BaseActivity"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->disableOrientation()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_0
    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIds:Ljava/util/List;

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialType:I

    new-instance v2, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;-><init>(Landroid/app/Activity;Ljava/util/List;ILcom/android/mltcode/paycertificationapi/iXiIO0i;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getRootView()Landroid/view/View;

    move-result-object p0

    const-string v0, "<get-rootView>(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object v5

    const-string p1, "<get-progressButton>(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->binUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->previewUrl:Ljava/lang/String;

    iget v8, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialType:I

    const/4 v3, -0x1

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->syncDial(IIILcom/sma/smartv3/view/ProgressButtonV2;Ljava/lang/String;Ljava/lang/String;I)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final dialIv_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a05fc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final dialNew_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0586

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getBtnView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->btnView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getDialIv()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->dialIv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getDialNew()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->dialNew$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMNestedScrollView()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mNestedScrollView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    return-object v0
.end method

.method private final getMOpenMembership()Lcom/sma/smartv3/view/ProgressButtonV2;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mOpenMembership$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ProgressButtonV2;

    return-object v0
.end method

.method private final getMOpenMembershipLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mOpenMembershipLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMPrecautionsTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPrecautionsTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private static final getOrderStatus$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isPaySuccess:Z

    const p1, 0x7f1410b1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->detailSyncDial()V

    goto :goto_0

    :cond_0
    const p0, 0x7f1410a9

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getProgressButton()Lcom/sma/smartv3/view/ProgressButtonV2;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->progressButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ProgressButtonV2;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvAlsoLike()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvAlsoLike$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAmount()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvAmount$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvLimitedFree()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvLimitedFree$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvMemory()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvMemory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final getWatchFaceDetail$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/WatchFaceDetail;)Lkotlin/Unit;
    .locals 4

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvMemory()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getFileSize()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%.2fMB"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->OX()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getDollar()F

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getAmount()F

    move-result v1

    :goto_0
    iput v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountOriginal:F

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->OX()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getDollarDis()F

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getAmountDis()F

    move-result v1

    :goto_1
    iput v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountMember:F

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getMemberAttr()Ljava/lang/String;

    move-result-object v1

    const-string v2, "2"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->Ii()Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountMember:F

    goto :goto_2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountOriginal:F

    :goto_2
    iput v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getPayStatus()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, ""

    :cond_3
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayStatus:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getPreviewUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->previewUrl:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getBinUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->binUrl:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getDialType()I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialType:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getBtnView()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getPreviewUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getPreviewUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getDialIv()Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getDialNew()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getNewFlag()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X1i()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    const/16 v2, 0x8

    :goto_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getLimitFreeFlag()Z

    move-result v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceDetail;->getMemberAttr()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->setViewText(ZLjava/lang/String;)V

    :cond_6
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final goCreateOrder()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ho6;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/ho6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    const-string v3, "WatchFace"

    invoke-virtual {v0, v3, v1, p0, v2}, Lcom/sma/smartv3/biz/OrderManager;->OXO1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final goCreateOrder$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/AccountCreateOrder;)Lkotlin/Unit;
    .locals 6

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AccountCreateOrder;->getOrderNum()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->orderNum:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isNeedPayDialog:Z

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "WatchFace"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/biz/OrderManager;->iIiiO(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const p1, 0x7f140bb0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final handleErrorCode(I)V
    .locals 2

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->RESUMED:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IX0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/OOX1XIiOI;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/OOX1XIiOI;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/OOX00;->iO(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/ProgressButtonV2;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mOpenMembership_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/ProgressButtonV2;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->progressButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvAmount_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->showConfirm$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->tvLimitedFree_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final initData()V
    .locals 6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isPaySuccess:Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getDialIv()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.sma.smartv3.model.WatchFaceCategoryV2"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPayStatus()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    iput-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayStatus:Ljava/lang/String;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->OX()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollar()F

    move-result v4

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmount()F

    move-result v4

    :goto_0
    iput v4, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountOriginal:F

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->OX()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollarDis()F

    move-result v4

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmountDis()F

    move-result v4

    :goto_1
    iput v4, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountMember:F

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getMemberAttr()Ljava/lang/String;

    move-result-object v4

    const-string v5, "2"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->Ii()Z

    move-result v2

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountMember:F

    goto :goto_2

    :cond_4
    iget v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountOriginal:F

    :goto_2
    iput v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->previewUrl:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getBinUrl()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->binUrl:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDialType()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_3

    :cond_5
    move v2, v0

    :goto_3
    iput v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialType:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getBtnView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvMemory()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getLimitFreeFlag()Z

    move-result v0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getMemberAttr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->setViewText(ZLjava/lang/String;)V

    goto :goto_4

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getBtnView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getWatchFaceDetail()V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Landroid/view/View;)V
    .locals 33

    move-object/from16 v0, p0

    sget-object v1, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/OrderManager;->iOO1ii1()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3, v4}, Lcom/sma/smartv3/biz/OrderManager;->X11iII1O1(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/model/AppUser;

    const v31, 0x7ffffff

    const/16 v32, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v3 .. v32}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    check-cast v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i72;->Oi1I(Landroid/content/Context;)V

    return-void

    :cond_1
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    const/4 v3, 0x2

    invoke-virtual {v2, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "mArg2"

    invoke-virtual {v2, v1, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mArg3"

    invoke-virtual {v2, v1, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v1, Landroid/content/Intent;

    const-class v3, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {v1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;[Lcom/sma/smartv3/model/WatchFaceCategoryV2;)Lkotlin/Unit;
    .locals 4

    if-nez p1, :cond_0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAlsoLike()Landroid/widget/TextView;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;

    invoke-direct {v1, p0, v0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Landroid/app/Activity;Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mNestedScrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroidx/core/widget/NestedScrollView;
    .locals 1

    const v0, 0x7f0a030a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    return-object p0
.end method

.method private static final mOpenMembershipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a08c8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mOpenMembership_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/ProgressButtonV2;
    .locals 1

    const v0, 0x7f0a08c7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ProgressButtonV2;

    return-object p0
.end method

.method private static final mPrecautionsTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0305

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0996

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final progressButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/ProgressButtonV2;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ProgressButtonV2;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final sendDial(Ljava/io/File;)V
    .locals 11

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->SYNCING:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WATCHFACE_ID:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget v5, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncDialId:I

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

    iget v3, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncDevicePosition:I

    invoke-virtual {v1, v2, p1, v3}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/File;I)Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XO10X()V

    return-void
.end method

.method public static synthetic sendDial$default(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Ljava/io/File;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBinFileName:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/android/mltcode/paycertificationapi/uz0;->O00(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->sendDial(Ljava/io/File;)V

    return-void
.end method

.method public static synthetic setViewText$default(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;ZLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const-string p2, ""

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->setViewText(ZLjava/lang/String;)V

    return-void
.end method

.method private final showConfirm()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f140e34

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/oo6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/oo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    const v2, 0x7f1412e2

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private static final showConfirm$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 32

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i72;->Oi1I(Landroid/content/Context;)V

    const/4 v0, 0x1

    return v0
.end method

.method private final showLoginHint()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mLoginHintPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140e32

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v1, 0x7f140e33

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mo6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/mo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mLoginHintPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mLoginHintPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final showLoginHint$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 32

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual/range {p0 .. p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i72;->OiXXXi10(Landroid/app/Activity;)V

    const/4 v0, 0x1

    return v0
.end method

.method private final showPayConfirm()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f1410b3

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/yn6;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/yn6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jo6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/jo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    const v2, 0x7f14162a

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final showPayConfirm$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getWatchFaceDetail()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final showPayConfirm$lambda$0$1(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getOrderStatus()V

    const/4 p0, 0x1

    return p0
.end method

.method private final syncDial(IIILcom/sma/smartv3/view/ProgressButtonV2;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 27

    move-object/from16 v8, p0

    move/from16 v4, p1

    move/from16 v0, p2

    move/from16 v1, p3

    sget-object v2, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/WatchFaceManager;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "syncDial -> position:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", mCurSyncPosition:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", mCurSyncDialId:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "  category = "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v5, p7

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iput v4, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncDialId:I

    iput v0, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncPosition:I

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->DOWNLOAD:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    iput v1, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncDevicePosition:I

    iget v0, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ".bin"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBinFileName:Ljava/lang/String;

    iget v3, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    const/4 v6, 0x0

    cmpg-float v3, v3, v6

    if-nez v3, :cond_0

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    const-string v7, "getAbsolutePath(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/io/File;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v9

    iget-object v10, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBinFileName:Ljava/lang/String;

    invoke-direct {v7, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v9, Ljava/io/File;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    iget v10, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v1

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_0
    move-object v5, v9

    move-object v9, v6

    goto/16 :goto_1

    :cond_0
    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->XXX11i(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/PAY"

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/io/File;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->XXX11i(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v9

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBinFileName:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "/PAY/"

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v7, v9, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v9, Ljava/io/File;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->XXX11i(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v11

    iget v12, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v1

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto/16 :goto_0

    :goto_1
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBinFileName:Ljava/lang/String;

    invoke-static {v7}, Lcom/blankj/utilcode/util/FileUtils;->getSize(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syncDial -> dial try get from dialFile file = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " size:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/16 v16, 0x3e

    const/16 v17, 0x0

    const v10, 0x7f1412fd

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v9, p4

    invoke-static/range {v9 .. v17}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    invoke-direct {v8, v7}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->sendDial(Ljava/io/File;)V

    return-void

    :cond_1
    const/16 v25, 0x3e

    const/16 v26, 0x0

    const v19, 0x7f140476

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v18, p4

    invoke-static/range {v18 .. v26}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    sget-object v10, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v11, v8, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBinFileName:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;

    move-object/from16 v1, p5

    move-object/from16 v6, p6

    move/from16 v3, p7

    move-object v2, v7

    move-object/from16 v7, p4

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;-><init>(Ljava/lang/String;Ljava/io/File;IILjava/io/File;Ljava/lang/String;Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-virtual {v10, v1, v9, v11, v0}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method public static synthetic syncDial$default(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;IIILcom/sma/smartv3/view/ProgressButtonV2;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    :goto_0
    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move/from16 v8, p7

    goto :goto_0

    :goto_1
    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->syncDial(IIILcom/sma/smartv3/view/ProgressButtonV2;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private final syncStatusChange(Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$OXO1;->OXO1:[I

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
    iget v1, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncCompleted:I

    int-to-float v1, v1

    iget v2, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncTotal:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    move-object/from16 v12, p1

    invoke-virtual {v12, v1}, Lcom/sma/smartv3/view/ProgressButtonV2;->setProgressDecimalPlaces(F)V

    return-void

    :cond_2
    move-object/from16 v12, p1

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const v13, 0x7f1412f6

    const/4 v14, 0x0

    const/4 v15, 0x0

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

.method private static final tvAlsoLike_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0583

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAmount_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0587

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvLimitedFree_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0584

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvMemory_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0585

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final detailSyncDial()V
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/no6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/no6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method public final getBinUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->binUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getMAmount()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    return v0
.end method

.method public final getMAmountMember()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountMember:F

    return v0
.end method

.method public final getMAmountOriginal()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountOriginal:F

    return v0
.end method

.method public final getMDialType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialType:I

    return v0
.end method

.method public final getMItemPosition()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mItemPosition:I

    return v0
.end method

.method public final getMPayStatus()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getOrderNum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->orderNum:Ljava/lang/String;

    return-object v0
.end method

.method public final getOrderStatus()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->orderNum:Ljava/lang/String;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/io6;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/io6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    const-string v3, "WatchFace"

    invoke-virtual {v0, v1, v3, v2}, Lcom/sma/smartv3/biz/OrderManager;->XX0(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getPreviewUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->previewUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getTAG()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public final getWatchFaceDetail()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/WatchFaceManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/go6;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/go6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/biz/WatchFaceManager;->IO(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$iO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final initSynced()V
    .locals 10

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIds:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object v1

    const-string v0, "<get-progressButton>(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const v2, 0x7f1412fb

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public initView()V
    .locals 12

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f1403a6

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMNestedScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object v0

    const v2, 0x7f0808ff

    invoke-static {p0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMPrecautionsTitle()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMPrecautionsTitle()Landroid/widget/TextView;

    move-result-object v2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    sub-int/2addr v3, v1

    const/4 v1, 0x0

    invoke-interface {v0, v1, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMOpenMembership()Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object v3

    const-string v0, "<get-mOpenMembership>(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f14043c

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v0, "getString(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x3c

    const/4 v11, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lcom/sma/smartv3/view/ProgressButtonV2;->XOO0ii0(Lcom/sma/smartv3/view/ProgressButtonV2;Ljava/lang/String;ZIZILjava/lang/String;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMOpenMembership()Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ko6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ko6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->initData()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->watchFaceClick()V

    sget-object v0, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/WatchFaceManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/lo6;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/lo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/biz/WatchFaceManager;->XXI(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final isNeedPayDialog()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isNeedPayDialog:Z

    return v0
.end method

.method public final isSync()Z
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

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

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d008b

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mItemPosition:I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->iOIi00Ii()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayStatus:Ljava/lang/String;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/XXiO;->XO0O10(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->XI1OX0IO()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->showConfirm()V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isSync()Z

    move-result p1

    if-eqz p1, :cond_2

    const p1, 0x7f1412fe

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIds:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f140440

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_3
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$onBottomClick$1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$iO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->I1Ii(Z)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isSync()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1412fd

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

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

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onOrderPayStatusChange"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isNeedPayDialog:Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getOrderStatus()V

    return-void
.end method

.method public onResume()V
    .locals 10

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isNeedPayDialog:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isNeedPayDialog:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->showPayConfirm()V

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WATCHFACE_ID:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIds:Ljava/util/List;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "syncId"

    invoke-virtual {v2, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIds:Ljava/util/List;

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->initSynced()V

    return-void
.end method

.method public final onShowEvaluationStatus()V
    .locals 4

    invoke-static {}, Lcom/sma/smartv3/model/EvaluationKt;->isShowEvaluationDialog()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/I0iiIOX;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0iiIOX;->XiOIO(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isSync()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f1412fd

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final setBinUrl(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->binUrl:Ljava/lang/String;

    return-void
.end method

.method public final setMAmount(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    return-void
.end method

.method public final setMAmountMember(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountMember:F

    return-void
.end method

.method public final setMAmountOriginal(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountOriginal:F

    return-void
.end method

.method public final setMDialType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialType:I

    return-void
.end method

.method public final setMItemPosition(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mItemPosition:I

    return-void
.end method

.method public final setMPayStatus(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayStatus:Ljava/lang/String;

    return-void
.end method

.method public final setNeedPayDialog(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isNeedPayDialog:Z

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->orderNum:Ljava/lang/String;

    return-void
.end method

.method public final setPreviewUrl(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->previewUrl:Ljava/lang/String;

    return-void
.end method

.method public final setViewText(ZLjava/lang/String;)V
    .locals 24
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "memberAttr"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->TAG:Ljava/lang/String;

    iget v4, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    iget-object v5, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayStatus:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " setViewText  mAmount = "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, "  mPayStatus = "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget v3, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    const v5, 0x7f14107e

    const-string v6, ": "

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-nez v3, :cond_0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v3

    const v9, 0x7f140c09

    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    iget v10, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    invoke-static {v10, v8, v7, v8}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iput-object v2, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialMemberAttr:Ljava/lang/String;

    const-string v3, "1"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    iput-boolean v9, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIsVipFreeFlag:Z

    const-string v9, "2"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    iput-boolean v9, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialDiscount:Z

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIsLimitFreeFlag:Z

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMOpenMembershipLayout()Landroid/view/View;

    move-result-object v9

    const/16 v10, 0x8

    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    iget-boolean v9, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIsLimitFreeFlag:Z

    if-eqz v9, :cond_1

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v5

    const v6, 0x7f140e1c

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_1
    iget-boolean v9, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialIsVipFreeFlag:Z

    const v11, 0x7f14107f

    const/16 v12, 0x10

    const v13, 0x7f06024d

    const v14, 0x7f06053b

    const/4 v15, 0x0

    if-eqz v9, :cond_3

    sget-object v9, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/i72;->Ii()Z

    move-result v9

    const v10, 0x7f140f34

    if-eqz v9, :cond_2

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v5

    invoke-virtual {v5, v12}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    iget v11, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountOriginal:F

    invoke-static {v11, v8, v7, v8}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v5

    invoke-static {v0, v14}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_2
    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v9

    invoke-virtual {v9, v15}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v9

    invoke-virtual {v0, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v9

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v9

    const v10, 0x7f06074b

    invoke-static {v0, v10}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v9

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget v10, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    invoke-static {v10, v8, v7, v8}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMOpenMembershipLayout()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    :cond_3
    iget-boolean v9, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mDialDiscount:Z

    if-eqz v9, :cond_5

    sget-object v9, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/i72;->Ii()Z

    move-result v9

    const v10, 0x7f14043d

    if-eqz v9, :cond_4

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    iget v10, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    invoke-static {v10, v8, v7, v8}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v5

    invoke-virtual {v5, v12}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    iget v10, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountOriginal:F

    invoke-static {v10, v8, v7, v8}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_1

    :cond_4
    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v9

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget v11, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    invoke-static {v11, v8, v7, v8}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMOpenMembershipLayout()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    iget v10, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmountMember:F

    invoke-static {v10, v8, v7, v8}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_5
    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v5

    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvLimitedFree()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getTvAmount()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_1
    const-string v5, "<get-progressButton>(...)"

    if-eqz v1, :cond_6

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const v7, 0x7f1412f6

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    goto :goto_3

    :cond_6
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const v7, 0x7f1410ae

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    goto :goto_3

    :cond_7
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mPayStatus:Ljava/lang/String;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/XXiO;->XO0O10(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_9

    iget v1, v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->mAmount:F

    cmpg-float v1, v1, v4

    if-nez v1, :cond_8

    goto :goto_2

    :cond_8
    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const v7, 0x7f1410ae

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    goto :goto_3

    :cond_9
    :goto_2
    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object v15

    invoke-static {v15, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v22, 0x3c

    const/16 v23, 0x0

    const v16, 0x7f1412f6

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v15 .. v23}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    :goto_3
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->initSynced()V

    return-void
.end method

.method public final watchFaceClick()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/WatchFaceManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/WatchFaceManager;->I0iXXO(Ljava/lang/String;)V

    return-void
.end method
