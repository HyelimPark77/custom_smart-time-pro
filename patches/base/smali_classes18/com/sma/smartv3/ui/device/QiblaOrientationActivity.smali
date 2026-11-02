.class public final Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQiblaOrientationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaOrientationActivity.kt\ncom/sma/smartv3/ui/device/QiblaOrientationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,225:1\n18#2,2:226\n15#2:228\n90#2:229\n*S KotlinDebug\n*F\n+ 1 QiblaOrientationActivity.kt\ncom/sma/smartv3/ui/device/QiblaOrientationActivity\n*L\n46#1:226,2\n46#1:228\n79#1:229\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQiblaOrientationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaOrientationActivity.kt\ncom/sma/smartv3/ui/device/QiblaOrientationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,225:1\n18#2,2:226\n15#2:228\n90#2:229\n*S KotlinDebug\n*F\n+ 1 QiblaOrientationActivity.kt\ncom/sma/smartv3/ui/device/QiblaOrientationActivity\n*L\n46#1:226,2\n46#1:228\n79#1:229\n*E\n"
    }
.end annotation


# instance fields
.field private final bgQibla$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isVibrate:Z

.field private final ivQiblaArrow$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivQiblaDial$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCompass:Lcom/android/mltcode/paycertificationapi/i1Xi1i0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mCurAzimuth:F

.field private mLocation:Lcom/sma/smartv3/location/CustomLocation;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPrayerTimeData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "+",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PrayerTime;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mPrayerTimeSettings:Lcom/sma/smartv3/model/PrayerTimeSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mQiblaDegree:I

.field private final tvAddress$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAngleBig$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvNextTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvQiblaAngle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 19

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/b92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/b92;-><init>(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->bgQibla$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/c92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/c92;-><init>(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvQiblaAngle$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/d92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/d92;-><init>(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->ivQiblaArrow$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/e92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/e92;-><init>(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->ivQiblaDial$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/f92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/f92;-><init>(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvAddress$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/g92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/g92;-><init>(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvCal$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/h92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/h92;-><init>(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvNextTime$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i92;-><init>(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvAngleBig$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/PrayerTimeSettings;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/sma/smartv3/model/PrayerTimeSettings;

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mPrayerTimeSettings:Lcom/sma/smartv3/model/PrayerTimeSettings;

    new-instance v2, Lcom/sma/smartv3/location/CustomLocation;

    const/16 v17, 0x3ff

    const/16 v18, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v18}, Lcom/sma/smartv3/location/CustomLocation;-><init>(DDDFIJLcom/sma/smartv3/location/CustomLocation$TYPE;FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->ivQiblaArrow_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvQiblaAngle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvAddress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->bgQibla_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvCal_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvAngleBig_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->ivQiblaDial_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvNextTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->initView$lambda$0(Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$adjustQiblaArrow(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;F)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->adjustQiblaArrow(F)V

    return-void
.end method

.method public static final synthetic access$adjustQiblaDial(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;F)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->adjustQiblaDial(F)V

    return-void
.end method

.method private final adjustQiblaArrow(F)V
    .locals 7

    new-instance v0, Landroid/view/animation/RotateAnimation;

    iget v1, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCurAzimuth:F

    neg-float v1, v1

    iget v2, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mQiblaDegree:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    neg-float v2, p1

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput p1, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCurAzimuth:F

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getIvQiblaArrow()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->showQiblaArrowDegree()V

    return-void
.end method

.method private final adjustQiblaDial(F)V
    .locals 7

    new-instance v0, Landroid/view/animation/RotateAnimation;

    iget v1, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCurAzimuth:F

    neg-float v1, v1

    neg-float v2, p1

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput p1, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCurAzimuth:F

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getIvQiblaDial()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private static final bgQibla_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a097c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private final calculateQiblaDegree(DDDD)D
    .locals 4

    const-wide v0, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr p1, v0

    mul-double/2addr p5, v0

    sub-double/2addr p7, p3

    mul-double/2addr p7, v0

    invoke-static {p7, p8}, Ljava/lang/Math;->sin(D)D

    move-result-wide p3

    invoke-static {p5, p6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    mul-double/2addr p3, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    invoke-static {p5, p6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    invoke-static {p5, p6}, Ljava/lang/Math;->cos(D)D

    move-result-wide p5

    mul-double/2addr p1, p5

    invoke-static {p7, p8}, Ljava/lang/Math;->cos(D)D

    move-result-wide p5

    mul-double/2addr p1, p5

    sub-double/2addr v0, p1

    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmpg-double p3, p1, p3

    if-gez p3, :cond_0

    const/16 p3, 0x168

    int-to-double p3, p3

    add-double/2addr p1, p3

    :cond_0
    return-wide p1
.end method

.method private final getBgQibla()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->bgQibla$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method private final getIvQiblaArrow()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->ivQiblaArrow$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getIvQiblaDial()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->ivQiblaDial$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getTvAddress()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvAddress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAngleBig()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvAngleBig$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvCal()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvCal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvNextTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvNextTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvQiblaAngle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->tvQiblaAngle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final initView$lambda$0(Landroid/view/View;)V
    .locals 0

    sget-object p0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer;->onRequestAgpsPrerequisite()V

    return-void
.end method

.method private static final ivQiblaArrow_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0660

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final ivQiblaDial_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0662

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final showQiblaArrowDegree()V
    .locals 5

    const/16 v0, 0x168

    int-to-float v1, v0

    iget v2, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCurAzimuth:F

    sub-float v2, v1, v2

    iget v3, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mQiblaDegree:I

    int-to-float v4, v3

    add-float/2addr v2, v4

    rem-float/2addr v2, v1

    sub-int/2addr v0, v3

    int-to-float v0, v0

    cmpg-float v3, v2, v0

    if-gez v3, :cond_0

    sub-float/2addr v0, v2

    sub-float/2addr v1, v0

    goto :goto_0

    :cond_0
    sub-float v1, v2, v0

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getTvQiblaAngle()Landroid/widget/TextView;

    move-result-object v0

    float-to-int v1, v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u00b0"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x43b18000    # 355.0f

    cmpl-float v0, v2, v0

    if-gtz v0, :cond_2

    const/high16 v0, 0x40a00000    # 5.0f

    cmpg-float v0, v2, v0

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->isVibrate:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getBgQibla()Landroid/view/ViewGroup;

    move-result-object v0

    const v1, 0x7f081590

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    return-void

    :cond_2
    :goto_1
    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->isVibrate:Z

    if-nez v0, :cond_3

    const-wide/16 v0, 0x64

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/VibrateUtils;->vibrate(J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->isVibrate:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getBgQibla()Landroid/view/ViewGroup;

    move-result-object v0

    const v1, 0x7f08158e

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_3
    return-void
.end method

.method private static final tvAddress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c24

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAngleBig_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c36

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvCal_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c4b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvNextTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cca

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvQiblaAngle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cf2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 5

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f141141

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1Xi1i0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1Xi1i0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCompass:Lcom/android/mltcode/paycertificationapi/i1Xi1i0;

    new-instance v1, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1Xi1i0;->iO(Lcom/android/mltcode/paycertificationapi/i1Xi1i0$XIi00iiXO;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getTvAddress()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/j92;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/j92;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RAW_WEATHER_REALTIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, Lcom/sma/smartv3/model/WeatherRealtime;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/WeatherRealtime;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getTvAddress()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/WeatherRealtime;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->onInfoChange(Ljava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00e5

    return v0
.end method

.method public final onInfoChange(Ljava/lang/Object;)V
    .locals 12
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "APP_LAST_LOCATION_INFO"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->XXIIO1i11()Lcom/sma/smartv3/location/CustomLocation;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v3

    const-wide v5, 0x40356c296b3354c1L    # 21.422507

    const-wide v7, 0x4043e9c1376d5497L    # 39.826209

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->calculateQiblaDegree(DDDD)D

    move-result-wide v1

    double-to-int p1, v1

    iput p1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mQiblaDegree:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getTvAngleBig()Landroid/widget/TextView;

    move-result-object p1

    iget v1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mQiblaDegree:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u00b0"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    const-string v1, "getInstance(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XiOIii1(Ljava/util/Calendar;)J

    move-result-wide v7

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mPrayerTimeSettings:Lcom/sma/smartv3/model/PrayerTimeSettings;

    iget-object p1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v3

    iget-object p1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v5

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lcom/sma/smartv3/model/PrayerTimesKt;->getPrayerTimeMap$default(Lcom/sma/smartv3/model/PrayerTimeSettings;DDJIILjava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mPrayerTimeData:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-object p1, Lcom/sma/smartv3/model/PrayerTime;->Companion:Lcom/sma/smartv3/model/PrayerTime$Companion;

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mPrayerTimeData:Ljava/util/Map;

    const-string v4, "mPrayerTimeData"

    const/4 v5, 0x0

    if-nez v3, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v5

    :cond_0
    invoke-virtual {p1, v3, v1, v2}, Lcom/sma/smartv3/model/PrayerTime$Companion;->findNextTime(Ljava/util/Map;J)Lcom/sma/smartv3/model/PrayerTime;

    move-result-object p1

    iput-object p1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    iget v7, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mQiblaDegree:I

    iget-object v8, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mPrayerTimeData:Ljava/util/Map;

    if-nez v8, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v5

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "onLocationInfoChange "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getTvNextTime()Landroid/widget/TextView;

    move-result-object p1

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeName(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeString()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getTvCal()Landroid/widget/TextView;

    move-result-object p1

    const/4 v3, 0x1

    invoke-static {v5, v3, v5}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->getTvCal()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const/4 v4, 0x0

    const/4 v8, 0x2

    invoke-static {v6, v7, v4, v8, v5}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1XOi1(JIILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v3, v5}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCompass:Lcom/android/mltcode/paycertificationapi/i1Xi1i0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i1Xi1i0;->O00()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCompass:Lcom/android/mltcode/paycertificationapi/i1Xi1i0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i1Xi1i0;->XO0O10()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCompass:Lcom/android/mltcode/paycertificationapi/i1Xi1i0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i1Xi1i0;->XO0O10()V

    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaOrientationActivity;->mCompass:Lcom/android/mltcode/paycertificationapi/i1Xi1i0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i1Xi1i0;->O00()V

    :cond_0
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

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
