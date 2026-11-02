.class public abstract Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseSportOnGoingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportOnGoingActivity.kt\ncom/sma/smartv3/ui/sport/BaseSportOnGoingActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,901:1\n19#2:902\n15#2:903\n94#2:904\n90#2:905\n94#2:909\n90#2:910\n255#3:906\n257#3,2:907\n173#4,7:911\n180#4,3:919\n143#4,7:922\n183#4:929\n173#4,7:930\n180#4,3:938\n143#4,7:941\n183#4:948\n173#4,7:949\n180#4,3:957\n143#4,7:960\n183#4:967\n173#4,7:968\n180#4,3:976\n143#4,7:979\n183#4:986\n69#4,3:987\n72#4,5:991\n1#5:918\n1#5:937\n1#5:956\n1#5:975\n1#5:990\n*S KotlinDebug\n*F\n+ 1 BaseSportOnGoingActivity.kt\ncom/sma/smartv3/ui/sport/BaseSportOnGoingActivity\n*L\n111#1:902\n111#1:903\n209#1:904\n209#1:905\n816#1:909\n816#1:910\n704#1:906\n705#1:907,2\n826#1:911,7\n826#1:919,3\n826#1:922,7\n826#1:929\n830#1:930,7\n830#1:938,3\n830#1:941,7\n830#1:948\n834#1:949,7\n834#1:957,3\n834#1:960,7\n834#1:967\n838#1:968,7\n838#1:976,3\n838#1:979,7\n838#1:986\n842#1:987,3\n842#1:991,5\n826#1:918\n830#1:937\n834#1:956\n838#1:975\n842#1:990\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseSportOnGoingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportOnGoingActivity.kt\ncom/sma/smartv3/ui/sport/BaseSportOnGoingActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,901:1\n19#2:902\n15#2:903\n94#2:904\n90#2:905\n94#2:909\n90#2:910\n255#3:906\n257#3,2:907\n173#4,7:911\n180#4,3:919\n143#4,7:922\n183#4:929\n173#4,7:930\n180#4,3:938\n143#4,7:941\n183#4:948\n173#4,7:949\n180#4,3:957\n143#4,7:960\n183#4:967\n173#4,7:968\n180#4,3:976\n143#4,7:979\n183#4:986\n69#4,3:987\n72#4,5:991\n1#5:918\n1#5:937\n1#5:956\n1#5:975\n1#5:990\n*S KotlinDebug\n*F\n+ 1 BaseSportOnGoingActivity.kt\ncom/sma/smartv3/ui/sport/BaseSportOnGoingActivity\n*L\n111#1:902\n111#1:903\n209#1:904\n209#1:905\n816#1:909\n816#1:910\n704#1:906\n705#1:907,2\n826#1:911,7\n826#1:919,3\n826#1:922,7\n826#1:929\n830#1:930,7\n830#1:938,3\n830#1:941,7\n830#1:948\n834#1:949,7\n834#1:957,3\n834#1:960,7\n834#1:967\n838#1:968,7\n838#1:976,3\n838#1:979,7\n838#1:986\n842#1:987,3\n842#1:991,5\n826#1:918\n830#1:937\n834#1:956\n838#1:975\n842#1:990\n*E\n"
    }
.end annotation


# instance fields
.field protected behavior:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/sma/smartv3/view/AnchorBottomSheetBehavior<",
            "Lcom/sma/smartv3/view/CustomNestedScollView;",
            ">;"
        }
    .end annotation
.end field

.field private final cardPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cardPanelSub$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private cardPanelSubMinHeight:I

.field private final countdownRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final countdownTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private goals:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final handleView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isBaiduMapReady:Z

.field private isGoogleMapReady:Z

.field private final isInChinaMainland:Z

.field private isShowMap:Z

.field private final ivGpsSignal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

.field private mBaiduLine:Lcom/baidu/mapapi/map/Overlay;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBaiduLineEnd:Lcom/baidu/mapapi/map/Overlay;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBaiduLineStart:Lcom/baidu/mapapi/map/Overlay;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mBaiduPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final mGMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mGoogleLine:Lcom/google/android/gms/maps/model/Polyline;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mGoogleLineEnd:Lcom/google/android/gms/maps/model/Marker;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mGoogleLineStart:Lcom/google/android/gms/maps/model/Marker;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

.field private final mGooglePoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private mLongPressPopup:Landroid/widget/PopupWindow;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mSportCallback$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSportShortPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mapPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final screenLockRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final slideLockView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportDataLL$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

.field private final sportEndProgress$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportFourShowValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportFourShowValueDesc$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportLeftLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportModelName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportOnGoingFl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportOneShowValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportOneShowValueDesc$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportPause$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportPausePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportProcess$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRightLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRunPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportSet$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportThreeShowValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportThreeShowValueDesc$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportTwoShowValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportTwoShowValueDesc$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final statuesPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 33

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1Xi;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1Xi;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXOO;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XXOO;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->countdownRl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XO1Ii00;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XO1Ii00;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->countdownTv$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0XXiIX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i0XXiIX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportProcess$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i11iXOi;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i11iXOi;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportSet$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iiiOii0O;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iiiOii0O;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportPause$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IX1i1III;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IX1i1III;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportOneShowValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXIX0OO;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XXIX0OO;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportTwoShowValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiX1X00i;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XiX1X00i;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportThreeShowValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0XOOII;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I0XOOII;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportFourShowValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIIIX0i10;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OIIIX0i10;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportOneShowValueDesc$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiO0X;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XiO0X;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportTwoShowValueDesc$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1XI1X;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O1XI1X;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportThreeShowValueDesc$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XOIIiIOIX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XOIIiIOIX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportFourShowValueDesc$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI0011OiX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OI0011OiX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportEndProgress$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0OIii0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O0OIii0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mapPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0OXO1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i0OXO1;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportRunPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXXXIiIX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XXXXIiIX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportPausePanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXIii10;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OXIii10;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->screenLockRl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iIXX0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iIXX0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->slideLockView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0110iiO;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/X0110iiO;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportDataLL$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IIOOX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIOOX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportOnGoingFl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX0Oi10i;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XX0Oi10i;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOXXXXI;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iOXXXXI;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanelSub$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOO1O0i;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iOO1O0i;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->handleView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XI1011OX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XI1011OX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->statuesPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XI1X0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XI1X0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->ivGpsSignal$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiO1O0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IiO1O0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportModelName$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiIOiXiX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XiIOiXiX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportLeftLayout$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXXiO001;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OXXiO001;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportRightLayout$delegate:Lkotlin/Lazy;

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

    iput-object v3, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X10O0;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/X10O0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v2}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGMapView$delegate:Lkotlin/Lazy;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IOIOXiIIX;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/IOIOXiIIX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v2}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBMapView$delegate:Lkotlin/Lazy;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "LOCATION_WHERE"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isInChinaMainland:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduPoints:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGooglePoints:Ljava/util/List;

    const/4 v1, 0x3

    new-array v1, v1, [I

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->goals:[I

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I10I0iIOI;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I10I0iIOI;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mSportCallback$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportPausePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    return-void
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroidx/cardview/widget/CardView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroidx/cardview/widget/CardView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportThreeShowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showLongPressTip$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    return-void
.end method

.method public static synthetic Ii1iii0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportOneShowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->countdownRl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportFourShowValueDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->statuesPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportOnGoingFl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mSportCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/SlideLockView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->slideLockView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/SlideLockView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->ivGpsSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/ImageButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportPause_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/ImageButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanelSub_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11I(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/SportEndProgress;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportEndProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/SportEndProgress;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/ImageButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportSet_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/ImageButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;Landroid/view/MotionEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showBaiDuMap$lambda$2(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;Landroid/view/MotionEvent;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportModelName_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->stopSport$lambda$0$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->stopSport$lambda$0$1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXO(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportRunPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->screenLockRl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportTwoShowValueDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    return-void
.end method

.method public static final synthetic access$getCardPanelSubMinHeight$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanelSubMinHeight:I

    return p0
.end method

.method public static final synthetic access$getMGooglePoints$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGooglePoints:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$isInChinaMainland$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isInChinaMainland:Z

    return p0
.end method

.method public static final synthetic access$setGoogleMapReady$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isGoogleMapReady:Z

    return-void
.end method

.method public static final synthetic access$setMGoogleMap$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    return-void
.end method

.method public static final synthetic access$updateGoogleMap(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateGoogleMap()V

    return-void
.end method

.method public static final synthetic access$updateMap(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;ZLcom/sma/smartv3/db/entity/Location;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateMap(ZLcom/sma/smartv3/db/entity/Location;)V

    return-void
.end method

.method private static final cardPanelSub_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0207

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final cardPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroidx/cardview/widget/CardView;
    .locals 1

    const v0, 0x7f0a0206

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/cardview/widget/CardView;

    return-object p0
.end method

.method private static final countdownRl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a028f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final countdownTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0290

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final createBaiduIcon(ILcom/baidu/mapapi/model/LatLng;Z)Lcom/baidu/mapapi/map/Overlay;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-nez v0, :cond_0

    const-string v0, "mBaiDuMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-direct {v1}, Lcom/baidu/mapapi/map/MarkerOptions;-><init>()V

    invoke-virtual {v1, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p2

    invoke-static {p1}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromResource(I)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/baidu/mapapi/map/MarkerOptions;->icon(Lcom/baidu/mapapi/map/BitmapDescriptor;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->draggable(Z)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->flat(Z)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/16 p2, 0x9

    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->zIndex(I)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    if-eqz p3, :cond_1

    const/high16 p2, 0x3f000000    # 0.5f

    invoke-virtual {p1, p2, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->anchor(FF)Lcom/baidu/mapapi/map/MarkerOptions;

    :cond_1
    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p1

    const-string p2, "addOverlay(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic createBaiduIcon$default(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;ILcom/baidu/mapapi/model/LatLng;ZILjava/lang/Object;)Lcom/baidu/mapapi/map/Overlay;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->createBaiduIcon(ILcom/baidu/mapapi/model/LatLng;Z)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createBaiduIcon"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object v0
.end method

.method private final getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object v0
.end method

.method private static final handleView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a03e2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportOneShowValueDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/CustomNestedScollView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportProcess_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIXi1iiXI(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->handleView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportFourShowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportLeftLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->countdownTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportTwoShowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportRightLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiX011(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mapPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiiiO(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportThreeShowValueDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iiiO(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportDataLL_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->XXIIO1i11()Lcom/sma/smartv3/location/CustomLocation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/location/CustomLocation;->OXO1()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpg-double v2, v2, v4

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v2

    cmpg-double v2, v2, v4

    if-nez v2, :cond_1

    return-void

    :cond_1
    iget-boolean v2, v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isInChinaMainland:Z

    invoke-virtual {v1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v3

    double-to-float v13, v3

    invoke-virtual {v1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v3

    double-to-float v12, v3

    new-instance v5, Lcom/sma/smartv3/db/entity/Location;

    const/16 v17, 0x39f

    const/16 v18, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v5 .. v18}, Lcom/sma/smartv3/db/entity/Location;-><init>(IJLjava/lang/String;IIFFIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v2, v5}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateMap(ZLcom/sma/smartv3/db/entity/Location;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 8

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->goals:[I

    const/4 v3, 0x0

    aget v3, v2, v3

    const/4 v4, 0x1

    aget v4, v2, v4

    const/4 v5, 0x2

    aget v5, v2, v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v7}, Lcom/sma/smartv3/ui/sport/XO0O10;->i100IXOX(Lcom/sma/smartv3/ui/sport/XO0O10;IZIIIILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->startSport()V

    return-void
.end method

.method private static final ivGpsSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0605

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    const v0, 0x7f0a00fc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object p0
.end method

.method private static final mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    const v0, 0x7f0a03fb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object p0
.end method

.method private static final mSportCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    return-object v0
.end method

.method private static final mapPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a03e5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private static final screenLockRl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a09e5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private final showBaiDuMap()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/TextureMapView;->showZoomControls(Z)V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/TextureMapView;->showScaleControl(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setCompassEnable(Z)V

    const-string v1, "apply(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isBaiduMapReady:Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduPoints:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateBaiduMap()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-nez v0, :cond_1

    const-string v0, "mBaiDuMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1Xi1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I1Xi1;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setOnMapTouchListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapTouchListener;)V

    return-void
.end method

.method private static final showBaiDuMap$lambda$2(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;Landroid/view/MotionEvent;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1
    return-void
.end method

.method private final showGoogleMap()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/MapView;->onCreate(Landroid/os/Bundle;)V

    new-instance v1, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;

    invoke-direct {v1, v0, p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;-><init>(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/MapView;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    new-instance v1, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$I0IIOi;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$I0IIOi;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/CustomGoogleMapView;->setOnMapTouchListener(Lcom/sma/smartv3/view/CustomGoogleMapView$OXO1;)V

    return-void
.end method

.method private static final showLongPressTip$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final showMapContent(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isShowMap:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showBaiDuMap()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showGoogleMap()V

    return-void
.end method

.method private static final slideLockView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/SlideLockView;
    .locals 1

    const v0, 0x7f0a0a59

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/SlideLockView;

    return-object p0
.end method

.method private static final sportDataLL_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a0a8d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private static final sportEndProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/SportEndProgress;
    .locals 1

    const v0, 0x7f0a0a91

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/SportEndProgress;

    return-object p0
.end method

.method private static final sportFourShowValueDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0a94

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportFourShowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0a93

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportLeftLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0afe

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final sportModelName_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0a99

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportOnGoingFl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a0a9b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private static final sportOneShowValueDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0a9d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportOneShowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0a9c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportPausePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a0aa1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private static final sportPause_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/ImageButton;
    .locals 1

    const v0, 0x7f0a0aa0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageButton;

    return-object p0
.end method

.method private static final sportProcess_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/CustomNestedScollView;
    .locals 1

    const v0, 0x7f0a0aa2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomNestedScollView;

    return-object p0
.end method

.method private static final sportRightLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0aff

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final sportRunPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a0ada

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private static final sportSet_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/widget/ImageButton;
    .locals 1

    const v0, 0x7f0a0adb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageButton;

    return-object p0
.end method

.method private static final sportThreeShowValueDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0ae0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportThreeShowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0adf

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportTwoShowValueDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0ae4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportTwoShowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ae3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final statuesPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a0b34

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private static final stopSport$lambda$0$0(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Z
    .locals 4

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->Oi(Lcom/sma/smartv3/ui/sport/XO0O10;ZILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->handleSportState(I)V

    return v3
.end method

.method private static final stopSport$lambda$0$1(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Z
    .locals 4

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X01IiOiIi(Lcom/sma/smartv3/ui/sport/XO0O10;ZILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMSportCallback()Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->XOO0XOOii(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->I1()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return v3
.end method

.method private final updateBaiduMap()V
    .locals 7

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isBaiduMapReady:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "updateBaiduMap: BaiduMap not ready yet"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X11iII1O1()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    const-string v1, "mBaiDuMap"

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduPoints:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/model/LatLng;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    const/4 v3, 0x0

    if-nez v2, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_3
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newLatLng(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduLineEnd:Lcom/baidu/mapapi/map/Overlay;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    :cond_4
    const v2, 0x7f081373

    const/4 v4, 0x1

    invoke-direct {p0, v2, v0, v4}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->createBaiduIcon(ILcom/baidu/mapapi/model/LatLng;Z)Lcom/baidu/mapapi/map/Overlay;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduLineEnd:Lcom/baidu/mapapi/map/Overlay;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-nez v0, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_5
    const/high16 v2, 0x41980000    # 19.0f

    invoke-static {v2}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->zoomTo(F)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduPoints:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v4, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduLine:Lcom/baidu/mapapi/map/Overlay;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    :cond_6
    new-instance v0, Lcom/baidu/mapapi/map/PolylineOptions;

    invoke-direct {v0}, Lcom/baidu/mapapi/map/PolylineOptions;-><init>()V

    const/16 v2, 0xe

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/PolylineOptions;->width(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const v4, 0x7f0600b4

    invoke-static {v2, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/PolylineOptions;->color(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduPoints:Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/PolylineOptions;->points(Ljava/util/List;)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    const-string v2, "points(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-nez v2, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    move-object v3, v2

    :goto_0
    invoke-virtual {v3, v0}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduLine:Lcom/baidu/mapapi/map/Overlay;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduLineStart:Lcom/baidu/mapapi/map/Overlay;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    :cond_8
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduPoints:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/baidu/mapapi/model/LatLng;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const v2, 0x7f081376

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->createBaiduIcon$default(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;ILcom/baidu/mapapi/model/LatLng;ZILjava/lang/Object;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object v0

    iput-object v0, v1, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduLineStart:Lcom/baidu/mapapi/map/Overlay;

    goto :goto_1

    :cond_9
    move-object v1, p0

    :goto_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    sget-object v2, Lcom/baidu/mapapi/map/LogoPosition;->logoPostionRightTop:Lcom/baidu/mapapi/map/LogoPosition;

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/TextureMapView;->setLogoPosition(Lcom/baidu/mapapi/map/LogoPosition;)V

    return-void
.end method

.method private final updateGoogleMap()V
    .locals 4

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isGoogleMapReady:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "updateGoogleMap: GoogleMap not ready yet"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_1

    const-string v0, "mGoogleMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    sget-object v1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X11iII1O1()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGooglePoints:Ljava/util/List;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    const/high16 v2, 0x41900000    # 18.0f

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGoogleLineEnd:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    :cond_3
    new-instance v2, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v2, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v1, v2, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const v2, 0x7f081373

    invoke-static {v2}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGoogleLineEnd:Lcom/google/android/gms/maps/model/Marker;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGooglePoints:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_6

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGoogleLine:Lcom/google/android/gms/maps/model/Polyline;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/Polyline;->remove()V

    :cond_4
    new-instance v1, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGooglePoints:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolylineOptions;

    const/high16 v2, 0x41600000    # 14.0f

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f060414

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGoogleLine:Lcom/google/android/gms/maps/model/Polyline;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGoogleLineStart:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    :cond_5
    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGooglePoints:Ljava/util/List;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const v2, 0x7f081376

    invoke-static {v2}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGoogleLineStart:Lcom/google/android/gms/maps/model/Marker;

    :cond_6
    :goto_0
    return-void
.end method

.method private final updateMap(ZLcom/sma/smartv3/db/entity/Location;)V
    .locals 5

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X11iII1O1()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduPoints:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGooglePoints:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mBaiduPoints:Ljava/util/List;

    new-instance v0, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result p2

    float-to-double v3, p2

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateBaiduMap()V

    return-void

    :cond_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result p1

    float-to-double v0, p1

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result p1

    float-to-double v2, p1

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isInChina(DD)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->OXO1:Lcom/android/mltcode/paycertificationapi/i01I1i1X;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result p2

    float-to-double v2, p2

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->OIi0(DD)Lkotlin/Pair;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGooglePoints:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mGooglePoints:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result p2

    float-to-double v3, p2

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateGoogleMap()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static synthetic updateShowData$default(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;Lcom/sma/smartv3/db/entity/SportData;ILjava/lang/Object;)V
    .locals 20

    if-nez p3, :cond_1

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    new-instance v1, Lcom/sma/smartv3/db/entity/SportData;

    const/16 v18, 0x7fff

    const/16 v19, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

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

    invoke-direct/range {v1 .. v19}, Lcom/sma/smartv3/db/entity/SportData;-><init>(IJLjava/lang/String;IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object/from16 v0, p0

    goto :goto_1

    :cond_0
    move-object/from16 v1, p1

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateShowData(Lcom/sma/smartv3/db/entity/SportData;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: updateShowData"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public changeDeviceConnectStatus(Z)V
    .locals 0

    return-void
.end method

.method public final checkSportModeView()V
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/a15;->O00(I)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/SportData;->setMMode(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportDataOrder()Lcom/android/mltcode/paycertificationapi/js4;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/j65;->OXO1(Lcom/android/mltcode/paycertificationapi/js4;)Lcom/android/mltcode/paycertificationapi/js4;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->setSportDataOrder(Lcom/android/mltcode/paycertificationapi/js4;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->hideViewFeature(Z)V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->hideViewFeature(Z)V

    return-void
.end method

.method public completeSport()V
    .locals 0

    return-void
.end method

.method public final dataFourClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x4

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 p1, 0x2174

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final dataOneClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 p1, 0x2174

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final dataThreeClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x3

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 p1, 0x2174

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final dataTwoClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 p1, 0x2174

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public disableBottomSheet()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/CustomNestedScollView;->disableNestedInterceptTouchEvent(Z)V

    return-void
.end method

.method public enableBottomSheet()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->XIXO0iiO(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/CustomNestedScollView;->disableNestedInterceptTouchEvent(Z)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->disableBottomSheet()V

    return-void
.end method

.method public final getBehavior()Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/sma/smartv3/view/AnchorBottomSheetBehavior<",
            "Lcom/sma/smartv3/view/CustomNestedScollView;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->behavior:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "behavior"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCardPanel()Landroidx/cardview/widget/CardView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    return-object v0
.end method

.method public final getCardPanelSub()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanelSub$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getCountdownRl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->countdownRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getCountdownTv()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->countdownTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getGoals()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->goals:[I

    return-object v0
.end method

.method public final getHandleView()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->handleView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final getIvGpsSignal()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->ivGpsSignal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMLongPressPopup()Landroid/widget/PopupWindow;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method public final getMSportCallback()Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mSportCallback$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;

    return-object v0
.end method

.method public final getMSportShortPopup()Lcom/android/mltcode/paycertificationapi/go0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mSportShortPopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-object v0
.end method

.method public final getMapPanel()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mapPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final getRootView()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final getScreenLockRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->screenLockRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getSlideLockView()Lcom/sma/smartv3/view/SlideLockView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->slideLockView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/SlideLockView;

    return-object v0
.end method

.method public final getSportDataLL()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportDataLL$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final getSportDataOrder()Lcom/android/mltcode/paycertificationapi/js4;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportEndProgress()Lcom/sma/smartv3/view/SportEndProgress;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportEndProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/SportEndProgress;

    return-object v0
.end method

.method public final getSportFourShowValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportFourShowValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getSportFourShowValueDesc()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportFourShowValueDesc$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getSportLeftLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportLeftLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getSportModelName()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportModelName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getSportOnGoingFl()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportOnGoingFl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final getSportOneShowValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportOneShowValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getSportOneShowValueDesc()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportOneShowValueDesc$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getSportPause()Landroid/widget/ImageButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportPause$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    return-object v0
.end method

.method public final getSportPausePanel()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportPausePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportProcess$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomNestedScollView;

    return-object v0
.end method

.method public final getSportRightLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportRightLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getSportRunPanel()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportRunPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final getSportSet()Landroid/widget/ImageButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportSet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    return-object v0
.end method

.method public final getSportThreeShowValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportThreeShowValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getSportThreeShowValueDesc()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportThreeShowValueDesc$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getSportTwoShowValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportTwoShowValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getSportTwoShowValueDesc()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportTwoShowValueDesc$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getStatuesPanel()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->statuesPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final getUserProfile()Lcom/sma/smartv3/model/AppUser;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    return-object v0
.end method

.method public handleSportState(I)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleSportState -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    if-eq p1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->stopSport(Z)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportPause()Landroid/widget/ImageButton;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportPausePanel()Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->disableBottomSheet()V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportPause()Landroid/widget/ImageButton;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportPausePanel()Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->enableBottomSheet()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    :goto_0
    return-void
.end method

.method public hideViewFeature(Z)V
    .locals 0

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initView -> mArg3: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object v2

    instance-of v2, v2, Lcom/szabh/smable3/entity/BleDeviceSportData;

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->X111IO(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object v2

    instance-of v2, v2, [I

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type kotlin.IntArray"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, [I

    iput-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->goals:[I

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->goals:[I

    invoke-static {v2}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "toString(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X00XIX1()Z

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "initView -> goals: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", isStartFromApp: "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/android/mltcode/paycertificationapi/js4;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v3, v6}, Lcom/android/mltcode/paycertificationapi/js4;-><init>(Ljava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5f

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v4, Lcom/android/mltcode/paycertificationapi/js4;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_0
    check-cast v5, Lcom/android/mltcode/paycertificationapi/js4;

    invoke-virtual {p0, v5}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->setSportDataOrder(Lcom/android/mltcode/paycertificationapi/js4;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->checkSportModeView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getRootView()Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v4, "SPORT_SCREEN_ALWAY_ON"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setKeepScreenOn(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportEndProgress()Lcom/sma/smartv3/view/SportEndProgress;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XIi00iiXO;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/SportEndProgress;->IiI10X(Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportEndProgress()Lcom/sma/smartv3/view/SportEndProgress;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$iO;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$iO;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/SportEndProgress;->iO(Lcom/sma/smartv3/view/SportEndProgress$OXO1;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSlideLockView()Lcom/sma/smartv3/view/SlideLockView;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XO0O10;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/SlideLockView;->I1XOi1(Lcom/sma/smartv3/view/SlideLockView$iO;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object v0

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->from(Landroid/view/View;)Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    move-result-object v0

    const-string v2, "from(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->setBehavior(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getBehavior()Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setHideable(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getBehavior()Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    move-result-object v0

    new-instance v4, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->addBottomSheetCallback(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportModelName()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    sget-object v4, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/android/mltcode/paycertificationapi/q62;->XIXO0iiO(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getBehavior()Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    move-result-object v0

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setState(I)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isInChinaMainland:Z

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showMapContent(Z)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iOiXi1i1O;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/iOiXi1i1O;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    const-wide/16 v4, 0x12c

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getHandleView()Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v4, 0x4

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getStatuesPanel()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->setSportOneShowValue(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getBehavior()Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setState(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCardPanel()Landroidx/cardview/widget/CardView;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->disableBottomSheet()V

    :goto_1
    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/III011;->OIi0(Landroid/content/Context;)Lcom/android/mltcode/paycertificationapi/III011;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/III011;->XXI()V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X00XIX1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->startCountDown()V

    goto :goto_2

    :cond_3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIOOi11I1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OIOOi11I1;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    const-wide/16 v4, 0x1f4

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_2
    invoke-static {p0, v6, v3, v6}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateShowData$default(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;Lcom/sma/smartv3/db/entity/SportData;ILjava/lang/Object;)V

    return-void
.end method

.method public final isInChina(DD)Z
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->OXO1:Lcom/android/mltcode/paycertificationapi/i01I1i1X;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->XO0O10(DD)Z

    move-result p1

    return p1
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0116

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/16 p2, 0x2174

    if-ne p2, p1, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lcom/android/mltcode/paycertificationapi/js4;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p3, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/js4;-><init>(Ljava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x5f

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class p2, Lcom/android/mltcode/paycertificationapi/js4;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, p1

    :goto_0
    check-cast p3, Lcom/android/mltcode/paycertificationapi/js4;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportDataOrder()Lcom/android/mltcode/paycertificationapi/js4;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->setSportDataOrder(Lcom/android/mltcode/paycertificationapi/js4;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->checkSportModeView()V

    sget-object p1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateShowData(Lcom/sma/smartv3/db/entity/SportData;)V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "getApplication(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->XX1Oi(Landroid/app/Application;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMSportCallback()Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->XiOIii1(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X00O0(Z)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X00O0(Z)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isShowMap:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onDestroy()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onDestroy()V

    :cond_1
    return-void
.end method

.method public onHandleBackPressed()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getScreenLockRl()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->iOiXi11II()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->XOXiX0(Lcom/sma/smartv3/ui/sport/XO0O10;ZILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->handleSportState(I)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showLongPressTip()V

    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isShowMap:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onPause()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onPause()V

    :cond_1
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isShowMap:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onResume()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onResume()V

    :cond_1
    return-void
.end method

.method public final onScreenOnChanged(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "SPORT_SCREEN_ALWAY_ON"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onScreenOnChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getRootView()Landroid/view/ViewGroup;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "SPORT_SCREEN_ALWAY_ON"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setKeepScreenOn(Z)V

    return-void
.end method

.method public final setBehavior(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/view/AnchorBottomSheetBehavior<",
            "Lcom/sma/smartv3/view/CustomNestedScollView;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->behavior:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    return-void
.end method

.method public final setGoals([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->goals:[I

    return-void
.end method

.method public final setMLongPressPopup(Landroid/widget/PopupWindow;)V
    .locals 0
    .param p1    # Landroid/widget/PopupWindow;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    return-void
.end method

.method public final setMSportShortPopup(Lcom/android/mltcode/paycertificationapi/go0;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/go0;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mSportShortPopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-void
.end method

.method public final setSportDataOrder(Lcom/android/mltcode/paycertificationapi/js4;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/js4;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    return-void
.end method

.method public setSportOneShowValue(F)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportOneShowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    return-void
.end method

.method public showGoalDoneDialog(I)V
    .locals 4

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0f4d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0632

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    sget-object v2, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->IXXOO()I

    move-result v3

    if-ne p1, v3, :cond_0

    const p1, 0x7f081798

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->i010I()I

    move-result v2

    if-ne p1, v2, :cond_1

    const p1, 0x7f0807ff

    goto :goto_0

    :cond_1
    const p1, 0x7f08090f

    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    new-instance p1, Landroid/app/Dialog;

    const v1, 0x7f15000f

    invoke-direct {p1, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public showGoalProgress(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDataType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sportData"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public showLongPressTip()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0f39

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.view.bubbleview.BubbleLayout"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    const v2, 0x7f0a0bf7

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f140e41

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/android/mltcode/paycertificationapi/XXiOOOX;->OXO1(Landroid/content/Context;Landroid/view/View;)Landroid/widget/PopupWindow;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    sget-object v2, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->BOTTOM:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->O00(Lcom/sma/smartv3/view/bubbleview/ArrowDirection;)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportEndProgress()Lcom/sma/smartv3/view/SportEndProgress;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportEndProgress()Lcom/sma/smartv3/view/SportEndProgress;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    add-int/2addr v2, v3

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v3}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    add-int/2addr v2, v3

    neg-int v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->getArrowWidth()F

    move-result v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XOO0ii0(F)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportEndProgress()Lcom/sma/smartv3/view/SportEndProgress;

    move-result-object v3

    invoke-virtual {v0, v3, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    :cond_2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iXXO0i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iXXO0i;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final showOneContent(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)Lkotlin/Pair;
    .locals 5
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDataType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/sport/SportDataType;",
            "Lcom/sma/smartv3/db/entity/SportData;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sportData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showGoalProgress(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)V

    sget-object v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OXO1;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMSpeed()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f141287

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_1
    new-instance p1, Lkotlin/Pair;

    sget-object p2, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/XO0O10;->iI()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/sma/smartv3/util/UtilsKt;->XOXiX0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f140cb6

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_2
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMAltitude()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f140120

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMSpm()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f14128d

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_4
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMStep()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f1412c6

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMCalorie()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f140274

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMPace()I

    move-result p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {p2, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f14108b

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_7
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMDistance()I

    move-result p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    const-string v1, ")"

    const-string v2, "("

    const v3, 0x7f140464

    if-nez v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->OXOO0X0i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v3, 0x7f1414d8

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v3, 0x7f140d6f

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->OXOO0X0i()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v3, 0x7f1414d9

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v3, 0x7f140f47

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_8
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMDuration()I

    move-result p2

    mul-int/lit16 p2, p2, 0x3e8

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f14133f

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final sportEndClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public sportLock()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->disableBottomSheet()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSlideLockView()Lcom/sma/smartv3/view/SlideLockView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/SlideLockView;->XiOIii1()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportRunPanel()Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getScreenLockRl()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public final sportLockClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportLock()V

    return-void
.end method

.method public sportPause()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->XOXiX0(Lcom/sma/smartv3/ui/sport/XO0O10;ZILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->handleSportState(I)V

    return-void
.end method

.method public final sportPauseClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportPause()V

    return-void
.end method

.method public sportResume()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->Oi(Lcom/sma/smartv3/ui/sport/XO0O10;ZILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->handleSportState(I)V

    return-void
.end method

.method public final sportResumeClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportResume()V

    return-void
.end method

.method public final sportSetClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/sport/SportSettingActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public sportStartVoice(J)V
    .locals 0

    return-void
.end method

.method public startCountDown()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCountdownRl()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    new-instance v0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method

.method public startSport()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCountdownRl()Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getScreenLockRl()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->handleSportState(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->XIXO0iiO(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getHandleView()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportDataLL()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportOnGoingFl()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanelSubMinHeight:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getBehavior()Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getRootView()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget v2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanelSubMinHeight:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setAnchorPoint(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getBehavior()Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanelSubMinHeight:I

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setPeekHeight(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCardPanelSub()Landroid/widget/RelativeLayout;

    move-result-object v0

    const-string v1, "<get-cardPanelSub>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->cardPanelSubMinHeight:I

    invoke-static {v0, v1}, Lcom/angcyo/dsladapter/LibExKt;->X111IO(Landroid/view/View;I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMapPanel()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getHandleView()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportDataLL()Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_0
    return-void
.end method

.method public stopSport(Z)V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u7ed3\u675f\u8fd0\u52a8 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mLongPressPopup:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    sget-object p1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-static {p1, v3, v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->OX(Lcom/sma/smartv3/ui/sport/XO0O10;ZILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mSportShortPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_1

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p1, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1412a1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f140d66

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0XXI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I0XXI;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOX11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOX11;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    const v1, 0x7f1404d9

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mSportShortPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->mSportShortPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getRootView()Landroid/view/ViewGroup;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void

    :cond_3
    sget-object p1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-static {p1, v3, v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->X01IiOiIi(Lcom/sma/smartv3/ui/sport/XO0O10;ZILjava/lang/Object;)V

    invoke-static {p1, v3, v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->OX(Lcom/sma/smartv3/ui/sport/XO0O10;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/XO0O10;->IO0iXO0O()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->completeSport()V

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMSportCallback()Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->XOO0XOOii(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/XO0O10;->I1()V

    const-string p1, "finish SportActivity"

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public updateShowData(Lcom/sma/smartv3/db/entity/SportData;)V
    .locals 5
    .param p1    # Lcom/sma/smartv3/db/entity/SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "sportData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportDataOrder()Lcom/android/mltcode/paycertificationapi/js4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v2, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showOneContent(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v4, 0x1

    if-eq v1, v4, :cond_4

    const/4 v4, 0x2

    if-eq v1, v4, :cond_2

    const/4 v4, 0x3

    if-eq v1, v4, :cond_1

    const/4 v4, 0x4

    if-eq v1, v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportFourShowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportFourShowValueDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportThreeShowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportThreeShowValueDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XO11O()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportLeftLayout()Landroid/view/View;

    move-result-object v1

    const-string v4, "<get-sportLeftLayout>(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportLeftLayout()Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportRightLayout()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v2, 0x40000000    # 2.0f

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportRightLayout()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportTwoShowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportTwoShowValueDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportOneShowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportOneShowValueDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_5
    return-void
.end method
