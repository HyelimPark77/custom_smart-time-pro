.class public final Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchFaceVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceVideoActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,794:1\n255#2:795\n*S KotlinDebug\n*F\n+ 1 WatchFaceVideoActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity\n*L\n539#1:795\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWatchFaceVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceVideoActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,794:1\n255#2:795\n*S KotlinDebug\n*F\n+ 1 WatchFaceVideoActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity\n*L\n539#1:795\n*E\n"
    }
.end annotation


# instance fields
.field private final REQUEST_RECORD_VIDEO:I

.field private final REQUEST_SELECT_VIDEO:I

.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final WATCHFACEVIEW_HEIGHT:F

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private controlElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

.field private final controlViewCa$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final controlViewDis$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final controlViewHr$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final controlViewStep$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final customizeDialBg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etFrameEdit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final is2DAcceleration:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivFrameAdd$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivFrameReduce$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBackgroundImageIndex:I

.field private final mBgFiles:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XOO0ii0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurSendBytes:[B

.field private mCurSyncDevicePosition:I

.field private mCurSyncDialId:I

.field private mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

.field private mDefaultFrameCount:I

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

.field private mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

.field private final mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mImageSwitchRunnable:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMaxFrameCount:I

.field private mPlayInterval:I

.field private mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mTotalCount:I

.field private final mViewPager$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final paramName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private pointerElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final timeDigitalView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private timeElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;

.field private final timePointView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final timeScaleView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvMaxCount$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final watchfaceView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "WatchFaceVideoActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->TAG:Ljava/lang/String;

    const/16 v0, 0x3e9

    iput v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->REQUEST_SELECT_VIDEO:I

    const/16 v0, 0x3ea

    iput v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->REQUEST_RECORD_VIDEO:I

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yo6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yo6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    const/high16 v0, 0x43820000    # 260.0f

    iput v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->WATCHFACEVIEW_HEIGHT:F

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->watchfaceView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->customizeDialBg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewStep$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zo6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zo6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewHr$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ap6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ap6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewCa$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewDis$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timeDigitalView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timePointView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ep6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ep6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timeScaleView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->tvMaxCount$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->ivFrameReduce$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->etFrameEdit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->ivFrameAdd$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/up6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/up6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vp6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mViewPager$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iIi011O()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/2d/"

    goto :goto_0

    :cond_0
    const-string v0, "/default/"

    :goto_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->is2DAcceleration:Ljava/lang/String;

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->paramName:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDialIds:Ljava/util/List;

    const/4 v0, 0x3

    iput v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    iput v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    const/16 v0, 0x8

    iput v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBgFiles:Ljava/util/List;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XOO0ii0;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XOO0ii0;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XOO0ii0;

    new-instance v0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mImageSwitchRunnable:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->syncWatchFace$lambda$1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->tvMaxCount_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->customizeDialBg_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timeDigitalView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewHr_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timeScaleView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->selectImagePopup$lambda$0$1$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Landroid/widget/EditText;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initVideoDialQuality$lambda$0$0(Landroid/widget/EditText;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initEditFrameView$lambda$2(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->ivFrameAdd_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initElementView$lambda$0$0(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewCa_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewDis_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initEditFrameView$lambda$1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewStep_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->selectImagePopup$lambda$0$1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initElementView$lambda$1$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->etFrameEdit_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroidx/cardview/widget/CardView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->watchfaceView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroidx/cardview/widget/CardView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static final synthetic access$getControlElementFragment$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

    return-object p0
.end method

.method public static final synthetic access$getControlViewCa(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewCa()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getControlViewDis(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewDis()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getControlViewHr(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewHr()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getControlViewStep(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewStep()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEtFrameEdit(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getEtFrameEdit()Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMBackgroundImageIndex$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBackgroundImageIndex:I

    return p0
.end method

.method public static final synthetic access$getMBgFiles$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBgFiles:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSyncDevicePosition:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSyncDialId:I

    return p0
.end method

.method public static final synthetic access$getMCustomWatchFace$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/android/mltcode/paycertificationapi/X1XX1O;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    return-object p0
.end method

.method public static final synthetic access$getMDefaultFrameCount$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    return p0
.end method

.method public static final synthetic access$getMDialIds$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDialIds:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMHandler$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getMPlayInterval$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mPlayInterval:I

    return p0
.end method

.method public static final synthetic access$getMProgressPop$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/android/mltcode/paycertificationapi/c72;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-object p0
.end method

.method public static final synthetic access$getPointerElementFragment$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->pointerElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;

    return-object p0
.end method

.method public static final synthetic access$getTimeDigitalView(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimeDigitalView()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTimeElementFragment$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timeElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;

    return-object p0
.end method

.method public static final synthetic access$getTimePointView(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimePointView()Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTimeScaleView(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimeScaleView()Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$initVideoDialQuality(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initVideoDialQuality(Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;)V

    return-void
.end method

.method public static final synthetic access$releaseBackgroundImagePlayback(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->releaseBackgroundImagePlayback()V

    return-void
.end method

.method public static final synthetic access$saveRecord(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->saveRecord()V

    return-void
.end method

.method public static final synthetic access$setMBackgroundImageIndex$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBackgroundImageIndex:I

    return-void
.end method

.method public static final synthetic access$setMProgressPop$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Lcom/android/mltcode/paycertificationapi/c72;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-void
.end method

.method public static final synthetic access$setMTotalCount$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    return-void
.end method

.method public static final synthetic access$syncFailed(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->syncFailed(I)V

    return-void
.end method

.method public static final synthetic access$syncWatchFace(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->syncWatchFace()V

    return-void
.end method

.method private final adjustWatchfaceViewWidth()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    const/4 v1, 0x0

    const-string v2, "mCustomWatchFace"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->X00O0()I

    move-result v0

    int-to-float v0, v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_1
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->Xi1i0XOX0()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v0, v3

    iget v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->WATCHFACEVIEW_HEIGHT:F

    mul-float/2addr v3, v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getWatchfaceView()Landroidx/cardview/widget/CardView;

    move-result-object v0

    const-string v4, "<get-watchfaceView>(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    iget v4, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->WATCHFACEVIEW_HEIGHT:F

    invoke-static {v4}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v4

    invoke-static {v0, v3, v4}, Lcom/angcyo/dsladapter/LibExKt;->i100IXOX(Landroid/view/View;II)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v3, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_2
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->XXI0XOIX()F

    move-result v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/view/ImageViewRound;->setRadius(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v3, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_3
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/view/ImageViewRound;->setType(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getWatchfaceView()Landroidx/cardview/widget/CardView;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v3, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_4
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v3

    if-eqz v3, :cond_5

    const/high16 v1, 0x43480000    # 200.0f

    goto :goto_1

    :cond_5
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v3, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    move-object v1, v3

    :goto_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->XXI0XOIX()F

    move-result v1

    :goto_1
    invoke-static {v1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    return-void
.end method

.method private final controlChangeStatus(Landroid/view/View;Landroid/widget/ImageView;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const p1, 0x7f081088

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const p1, 0x7f081089

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private static final controlViewCa_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    const v0, 0x7f0a0289

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object p0
.end method

.method private static final controlViewDis_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    const v0, 0x7f0a028a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object p0
.end method

.method private static final controlViewHr_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    const v0, 0x7f0a028b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object p0
.end method

.method private static final controlViewStep_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    const v0, 0x7f0a028c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object p0
.end method

.method private static final customizeDialBg_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    const v0, 0x7f0a02c6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object p0
.end method

.method private static final etFrameEdit_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0373

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getControlViewCa()Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewCa$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object v0
.end method

.method private final getControlViewDis()Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewDis$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object v0
.end method

.method private final getControlViewHr()Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewHr$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object v0
.end method

.method private final getControlViewStep()Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlViewStep$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object v0
.end method

.method private final getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->customizeDialBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object v0
.end method

.method private final getEtFrameEdit()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->etFrameEdit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getIvFrameAdd()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->ivFrameAdd$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getIvFrameReduce()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->ivFrameReduce$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMViewPager()Lcom/sma/smartv3/view/NoScollViewPager;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mViewPager$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/NoScollViewPager;

    return-object v0
.end method

.method private final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method private final getTimeDigitalView()Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timeDigitalView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object v0
.end method

.method private final getTimePointView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timePointView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getTimeScaleView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timeScaleView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getTvMaxCount()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->tvMaxCount$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getWatchfaceView()Landroidx/cardview/widget/CardView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->watchfaceView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    return-object v0
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

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->selectImagePopup$lambda$0$0$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->ivFrameReduce_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timePointView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->selectImagePopup$lambda$0$0(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Landroid/widget/EditText;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initEditFrameView$lambda$0$0(Landroid/widget/EditText;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/NoScollViewPager;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mViewPager_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/NoScollViewPager;

    move-result-object p0

    return-object p0
.end method

.method private final initEditFrameView()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTvMaxCount()Landroid/widget/TextView;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f1414c7

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getEtFrameEdit()Landroid/widget/EditText;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setInputType(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/c6;

    iget v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    new-instance v3, Lcom/android/mltcode/paycertificationapi/lp6;

    invoke-direct {v3, v0, p0}, Lcom/android/mltcode/paycertificationapi/lp6;-><init>(Landroid/widget/EditText;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    const/4 v4, 0x1

    invoke-direct {v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/c6;-><init>(IILkotlin/jvm/functions/Function0;)V

    filled-new-array {v1}, [Lcom/android/mltcode/paycertificationapi/c6;

    move-result-object v1

    check-cast v1, [Landroid/text/InputFilter;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    new-instance v1, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getIvFrameReduce()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mp6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/mp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getIvFrameAdd()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/np6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/np6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final initEditFrameView$lambda$0$0(Landroid/widget/EditText;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;
    .locals 1

    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/view/View;)V

    iget p0, p1, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const v0, 0x7f1414c6

    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initEditFrameView$lambda$1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    iget v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->isInRange(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getEtFrameEdit()Landroid/widget/EditText;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->releaseBackgroundImagePlayback()V

    return-void

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const v0, 0x7f1414c6

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private static final initEditFrameView$lambda$2(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    iget v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->isInRange(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getEtFrameEdit()Landroid/widget/EditText;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->releaseBackgroundImagePlayback()V

    return-void

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const v0, 0x7f1414c6

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private final initElementView()V
    .locals 9

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleCache;->getMDeviceInfo()Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/sma/smartv3/model/ResourcesIdInfoKt;->getWatchFaceElementPointers(Lcom/szabh/smable3/entity/BleDeviceInfo;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleCache;->getMDeviceInfo()Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    const/4 v3, 0x0

    const-string v4, "mCustomWatchFace"

    if-nez v2, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v2

    invoke-static {v0, v2}, Lcom/sma/smartv3/model/ResourcesIdInfoKt;->getWatchFaceElementScales(Lcom/szabh/smable3/entity/BleDeviceInfo;Z)Ljava/util/List;

    move-result-object v0

    invoke-static {p0}, Lcom/sma/smartv3/model/ResourcesIdInfoKt;->getWatchFaceElementColors(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    invoke-static {}, Lcom/sma/smartv3/model/ResourcesIdInfoKt;->getWatchFaceElementDigitalTimes()Ljava/util/List;

    move-result-object v5

    new-instance v6, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;

    iget-object v7, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v7, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v3

    :cond_1
    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v7

    new-instance v8, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XIi00iiXO;

    invoke-direct {v8, p0, v1, v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Ljava/util/List;Ljava/util/List;)V

    invoke-direct {v6, v1, v0, v7, v8}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;-><init>(Ljava/util/List;Ljava/util/List;ZLcom/android/mltcode/paycertificationapi/az1;)V

    iput-object v6, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->pointerElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;

    new-instance v0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v1, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v1

    new-instance v6, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$iO;

    invoke-direct {v6, p0, v5}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Ljava/util/List;)V

    invoke-direct {v0, v2, v1, v6}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;-><init>(Ljava/util/List;ZLcom/android/mltcode/paycertificationapi/IXI011X11;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ip6;

    invoke-direct {v1, v0, p0}, Lcom/android/mltcode/paycertificationapi/ip6;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;->setOnViewClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timeElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;

    new-instance v0, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v1, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v3, v1

    :goto_0
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v1

    new-instance v3, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XO0O10;

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Ljava/util/List;)V

    invoke-direct {v0, v2, v1, v3}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;-><init>(Ljava/util/List;ZLcom/android/mltcode/paycertificationapi/IXI011X11;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kp6;

    invoke-direct {v1, p0, v0}, Lcom/android/mltcode/paycertificationapi/kp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;->setOnViewClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

    new-instance v0, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    new-instance v1, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$O00;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$O00;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-direct {v0, v1}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;-><init>(Lcom/android/mltcode/paycertificationapi/jl1;)V

    const v1, 0x7f1410f7

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1411cc

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f14133f

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x7f140361

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v1, v2, v4}, [Ljava/lang/String;

    move-result-object v1

    check-cast v1, [Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getMViewPager()Lcom/sma/smartv3/view/NoScollViewPager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getMViewPager()Lcom/sma/smartv3/view/NoScollViewPager;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->getCount()I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getMViewPager()Lcom/sma/smartv3/view/NoScollViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getMViewPager()Lcom/sma/smartv3/view/NoScollViewPager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/NoScollViewPager;->setCanScoll(Z)V

    return-void
.end method

.method private static final initElementView$lambda$0$0(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    const v0, 0x7f0a02f8

    if-ne p2, v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->getDialSelectStatus0()Landroid/widget/ImageView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimeDigitalView()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->getDialSelectStatus0()Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    invoke-virtual {p2, p0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimePointView()Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimeScaleView()Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p0, p1, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->pointerElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;

    if-nez p0, :cond_1

    const-string p0, "pointerElementFragment"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->reset()V

    :cond_2
    return-void
.end method

.method private static final initElementView$lambda$1$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;Landroid/view/View;)V
    .locals 1

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    packed-switch p2, :pswitch_data_0

    return-void

    :pswitch_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewDis()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p2

    const-string v0, "<get-controlViewDis>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;->getDialSelectStatus3()Landroid/widget/ImageView;

    move-result-object p1

    const-string v0, "<get-dialSelectStatus3>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlChangeStatus(Landroid/view/View;Landroid/widget/ImageView;)V

    return-void

    :pswitch_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewCa()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p2

    const-string v0, "<get-controlViewCa>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;->getDialSelectStatus2()Landroid/widget/ImageView;

    move-result-object p1

    const-string v0, "<get-dialSelectStatus2>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlChangeStatus(Landroid/view/View;Landroid/widget/ImageView;)V

    return-void

    :pswitch_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewHr()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p2

    const-string v0, "<get-controlViewHr>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;->getDialSelectStatus1()Landroid/widget/ImageView;

    move-result-object p1

    const-string v0, "<get-dialSelectStatus1>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlChangeStatus(Landroid/view/View;Landroid/widget/ImageView;)V

    return-void

    :pswitch_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewStep()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p2

    const-string v0, "<get-controlViewStep>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;->getDialSelectStatus0()Landroid/widget/ImageView;

    move-result-object p1

    const-string v0, "<get-dialSelectStatus0>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlChangeStatus(Landroid/view/View;Landroid/widget/ImageView;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x7f0a02f8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final initVideoDialQuality(Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onReadWatchFaceMaxSize: sizeInfo = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->getMTotalSize()I

    move-result v0

    if-gtz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->getMTotalSize()I

    move-result p1

    div-int/lit16 p1, p1, 0x400

    div-int/lit16 p1, p1, 0x400

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x3

    if-lt p1, v2, :cond_1

    const/16 p1, 0x14

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    const/16 p1, 0x9

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    goto :goto_0

    :cond_1
    if-lt p1, v1, :cond_2

    const/16 p1, 0xf

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    const/4 p1, 0x6

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    goto :goto_0

    :cond_2
    const/16 v3, 0x8

    if-lt p1, v0, :cond_3

    iput v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    iput v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    goto :goto_0

    :cond_3
    iput v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    iput v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    :goto_0
    iget p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTvMaxCount()Landroid/widget/TextView;

    move-result-object p1

    iget v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f1414c7

    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getEtFrameEdit()Landroid/widget/EditText;

    move-result-object p1

    iget v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setInputType(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/c6;

    iget v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    new-instance v3, Lcom/android/mltcode/paycertificationapi/fp6;

    invoke-direct {v3, p1, p0}, Lcom/android/mltcode/paycertificationapi/fp6;-><init>(Landroid/widget/EditText;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-direct {v1, v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/c6;-><init>(IILkotlin/jvm/functions/Function0;)V

    filled-new-array {v1}, [Lcom/android/mltcode/paycertificationapi/c6;

    move-result-object v0

    check-cast v0, [Landroid/text/InputFilter;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method private static final initVideoDialQuality$lambda$0$0(Landroid/widget/EditText;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;
    .locals 1

    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/view/View;)V

    iget p0, p1, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mMaxFrameCount:I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const v0, 0x7f1414c6

    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final initWatchfaceView()V
    .locals 4

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$IiI10X;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$IiI10X;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Landroid/app/Application;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewStep()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    const/4 v2, 0x0

    const-string v3, "mCustomWatchFace"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/dial/DialElementView;->setIsRangeCircle(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewHr()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/dial/DialElementView;->setIsRangeCircle(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewCa()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/dial/DialElementView;->setIsRangeCircle(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewDis()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_3
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/dial/DialElementView;->setIsRangeCircle(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimeDigitalView()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v1, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v2, v1

    :goto_0
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O1()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/dial/DialElementView;->setIsRangeCircle(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->adjustWatchfaceViewWidth()V

    return-void
.end method

.method private final isInRange(II)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-le p1, v1, :cond_1

    if-lt p2, v1, :cond_0

    if-gt p2, p1, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    if-lt p2, p1, :cond_2

    if-gt p2, v1, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method private static final ivFrameAdd_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a062d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final ivFrameReduce_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a062e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mViewPager_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/NoScollViewPager;
    .locals 1

    const v0, 0x7f0a18fd    # 1.835632E38f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/NoScollViewPager;

    return-object p0
.end method

.method private final recordVideo()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.VIDEO_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.extra.videoQuality"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "putExtra(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->REQUEST_RECORD_VIDEO:I

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method

.method private final releaseBackgroundImagePlayback()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->stopBackgroundImagePlayback()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBackgroundImageIndex:I

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBgFiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v0, :cond_0

    const-string v0, "mCustomWatchFace"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->iX1O1()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08156e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private final saveRecord()V
    .locals 6

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSyncDialId:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->paramName:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->is2DAcceleration:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXX11i(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".png"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const-string v3, "mCustomWatchFace"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v4

    :cond_0
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->IXiOXO()[B

    move-result-object v3

    invoke-static {v1, v3}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[B)Z

    new-instance v1, Ljava/io/File;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXX11i(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSendBytes:[B

    if-nez v0, :cond_1

    const-string v0, "mCurSendBytes"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_1
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[B)Z

    const-string v0, "sync_dial"

    const/4 v1, 0x2

    invoke-static {v0, v4, v1, v4}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final selectImagePopup()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xz3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xz3;-><init>(Landroid/app/Activity;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/op6;

    invoke-direct {v1, v0, p0}, Lcom/android/mltcode/paycertificationapi/op6;-><init>(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;->iX(Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pp6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/pp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;->i010I(Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private static final selectImagePopup$lambda$0$0(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object p0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hp6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/hp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-virtual {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/hr1;->iOOX010X(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final selectImagePopup$lambda$0$0$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->recordVideo()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final selectImagePopup$lambda$0$1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lkotlin/Unit;
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/gp6;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/gp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/hr1;->XX1Oi(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final selectImagePopup$lambda$0$1$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->selectVideo()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final selectVideo()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.PICK"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "video/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "setType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->REQUEST_SELECT_VIDEO:I

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private final startBackgroundImagePlayback()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->stopBackgroundImagePlayback()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBackgroundImageIndex:I

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mImageSwitchRunnable:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final stopBackgroundImagePlayback()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mImageSwitchRunnable:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final syncFailed(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->handleErrorCode(I)V

    return-void
.end method

.method public static synthetic syncFailed$default(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->syncFailed(I)V

    return-void
.end method

.method private final syncWatchFace()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c72;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/c72;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140439

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/c72;->I1(I)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/c72;->OX(I)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    const v1, 0x7f14043a

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/c72;->I1(I)V

    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qp6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qp6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_1
    return-void
.end method

.method private static final syncWatchFace$lambda$1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    const/4 v1, 0x0

    const-string v2, "mCustomWatchFace"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/16 v3, 0xc8

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->O0i(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBgFiles:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBgFiles:Ljava/util/List;

    goto :goto_0

    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v3

    :goto_0
    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->Oiii(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v1, v0

    :goto_1
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->IO()[B

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSendBytes:[B

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->i010I(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    sget-object v4, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v4

    iget v6, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSyncDialId:I

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ".png"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/io/File;Ljava/io/File;)Z

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSyncDevicePosition:I

    array-length v3, v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " Custom WatchFace bytes size  "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->WATCH_FACE:Lcom/szabh/smable3/BleKey;

    iget p0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSyncDevicePosition:I

    invoke-virtual {v1, v2, v0, p0}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    return-void
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method

.method private static final timeDigitalView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/sma/smartv3/view/dial/DialElementView;
    .locals 1

    const v0, 0x7f0a0bb0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/dial/DialElementView;

    return-object p0
.end method

.method private static final timePointView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0bb1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final timeScaleView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0bb2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final tvMaxCount_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cb7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final watchfaceView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroidx/cardview/widget/CardView;
    .locals 1

    const v0, 0x7f0a1916

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/cardview/widget/CardView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XOO0ii0;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->GET_WATCH_FACE_MAX_SIZE:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1414a0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initWatchfaceView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initElementView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initEditFrameView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d013c

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->REQUEST_SELECT_VIDEO:I

    if-eq p1, p2, :cond_4

    iget p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->REQUEST_RECORD_VIDEO:I

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x1

    if-ne p1, p2, :cond_8

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_2
    if-eqz p3, :cond_3

    const-string p1, "interval"

    const/4 p2, 0x0

    invoke-virtual {p3, p1, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mPlayInterval:I

    :cond_3
    if-eqz p3, :cond_8

    const-string p1, "urls"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_8

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mPlayInterval:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " onActivityResult: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_8

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBgFiles:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBgFiles:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->startBackgroundImagePlayback()V

    return-void

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_5
    if-eqz p3, :cond_8

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-static {p0, p1}, Lcom/sma/smartv3/util/UtilsKt;->OX110i(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    const-string p3, "mCustomWatchFace"

    if-nez p2, :cond_6

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p2, v0

    :cond_6
    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->X00O0()I

    move-result p2

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCustomWatchFace:Lcom/android/mltcode/paycertificationapi/X1XX1O;

    if-nez v1, :cond_7

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v0, v1

    :goto_2
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->Xi1i0XOX0()I

    move-result p3

    iget v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mTotalCount:I

    invoke-static {p0, p1, p2, p3, v0}, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->call(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;III)V

    :cond_8
    return-void
.end method

.method public final onAddBg(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->selectImagePopup()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$XOO0ii0;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->i11I(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->stopBackgroundImagePlayback()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    const v0, 0x7f1412fd

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final onReset(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewStep()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewHr()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewCa()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getControlViewDis()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimeDigitalView()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimePointView()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getTimeScaleView()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

    const-string v0, "controlElementFragment"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;->getDialSelectStatus0()Landroid/widget/ImageView;

    move-result-object p1

    const v2, 0x7f081088

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

    if-nez p1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_1
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;->getDialSelectStatus1()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

    if-nez p1, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_2
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;->getDialSelectStatus2()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

    if-nez p1, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_3
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;->getDialSelectStatus3()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->releaseBackgroundImagePlayback()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->getEtFrameEdit()Landroid/widget/EditText;

    move-result-object p1

    iget v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mDefaultFrameCount:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->pointerElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;

    if-nez p1, :cond_4

    const-string p1, "pointerElementFragment"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_4
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->reset()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->timeElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;

    if-nez p1, :cond_5

    const-string p1, "timeElementFragment"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_5
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->reset()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->controlElementFragment:Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

    if-nez p1, :cond_6

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    move-object v1, p1

    :goto_0
    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;->reset()V

    return-void
.end method

.method public final onSycn(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mBgFiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f141212

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSyncDevicePosition:I

    const p1, 0x989680

    iput p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mCurSyncDialId:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->syncWatchFace()V

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz p1, :cond_0

    const p1, 0x7f1412fd

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
