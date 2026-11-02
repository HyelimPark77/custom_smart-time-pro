.class public final Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/vtrump/vtble/iO$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBodyFatScaleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyFatScaleActivity.kt\ncom/sma/smartv3/ui/status/BodyFatScaleActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,389:1\n19#2:390\n15#2:391\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 BodyFatScaleActivity.kt\ncom/sma/smartv3/ui/status/BodyFatScaleActivity\n*L\n53#1:390\n53#1:391\n270#1:392,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBodyFatScaleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyFatScaleActivity.kt\ncom/sma/smartv3/ui/status/BodyFatScaleActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,389:1\n19#2:390\n15#2:391\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 BodyFatScaleActivity.kt\ncom/sma/smartv3/ui/status/BodyFatScaleActivity\n*L\n53#1:390\n53#1:391\n270#1:392,2\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private appUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnMeasureWeight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isDone:Z

.field private final listener:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llWeightMeasure$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llWeightMeasureInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBleManager:Lcom/vtrump/vtble/iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mErrorTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPermissionBackgroundPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mVtDeviceScale:Lcom/vtrump/vtble/XO0O10;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeight:Lcom/sma/smartv3/db/entity/Weight;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvGreet$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvMeasureTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvWeightValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXX0OXX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IXX0OXX;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OII0000;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OII0000;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O10i0OOi;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O10i0OOi;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvWeightValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XIi0Ii;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XIi0Ii;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->llWeightMeasure$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1O01;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I1O01;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->llWeightMeasureInfo$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/II1IO1i1X;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/II1IO1i1X;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvMeasureTip$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iX1I1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iX1I1;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvTip$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0XXiOi00;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i0XXiOi00;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->btnMeasureWeight$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X10X1I;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/X10X1I;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvGreet$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->weightDao()Lcom/sma/smartv3/db/dao/WeightDao;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    new-instance v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;

    invoke-direct {v1, v0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->listener:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvWeightValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvMeasureTip_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvGreet_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->llWeightMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->llWeightMeasureInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->btnMeasureWeight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->handlerMeasureErrorState$lambda$0$1(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->onTitleLeftClick$lambda$0$1(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIii1()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->permissionRemind$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getAppUser$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/model/AppUser;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    return-object p0
.end method

.method public static final synthetic access$getMVtDeviceScale$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/vtrump/vtble/XO0O10;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mVtDeviceScale:Lcom/vtrump/vtble/XO0O10;

    return-object p0
.end method

.method public static final synthetic access$getMWeight$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/db/entity/Weight;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    return-object p0
.end method

.method public static final synthetic access$getTvWeightValue(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvWeightValue()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handlerMeasureDoneState(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->handlerMeasureDoneState()V

    return-void
.end method

.method public static final synthetic access$handlerMeasureErrorState(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Lcom/android/mltcode/paycertificationapi/X01O1XO0i;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->handlerMeasureErrorState(Lcom/android/mltcode/paycertificationapi/X01O1XO0i;)V

    return-void
.end method

.method public static final synthetic access$setMWeight$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Lcom/sma/smartv3/db/entity/Weight;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    return-void
.end method

.method private static final btnMeasureWeight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01d8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getBtnMeasureWeight()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->btnMeasureWeight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getLlWeightMeasure()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->llWeightMeasure$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getLlWeightMeasureInfo()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->llWeightMeasureInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvGreet()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvGreet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvMeasureTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvMeasureTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvTip()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvWeightValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->tvWeightValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final handlerMeasureDoneState()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->isDone:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasure()Landroid/view/View;

    move-result-object v1

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasureInfo()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f140f0d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvMeasureTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140f12

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvTip()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final handlerMeasureErrorState(Lcom/android/mltcode/paycertificationapi/X01O1XO0i;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error - > "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->isDone:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasure()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasureInfo()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v0

    const v2, 0x7f140f0d

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvMeasureTip()Landroid/widget/TextView;

    move-result-object v0

    const v3, 0x7f140f12

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvTip()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mErrorTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v1, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const p1, 0x7f140f13

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const p1, 0x7f140c53

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0010I11;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/i0010I11;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-virtual {v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/XIXOXOi;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/XIXOXOi;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-virtual {v0, v2, p1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mErrorTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mErrorTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final handlerMeasureErrorState$lambda$0$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final handlerMeasureErrorState$lambda$0$1(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->scan()V

    const/4 p0, 0x1

    return p0
.end method

.method private final handlerMeasureTimeoutState()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->isDone:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasure()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasureInfo()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f140f0d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvMeasureTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140f11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvTip()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final handlerMeasuringState()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->isDone:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasure()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasureInfo()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v1

    const v2, 0x7f140f1a

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvMeasureTip()Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f140f12

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvTip()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final handlerNoMeasureState()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->isDone:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasure()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasureInfo()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v1

    const v2, 0x7f140255

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvMeasureTip()Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f140f12

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvTip()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final handlerUnconnectState()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->isDone:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasure()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getLlWeightMeasureInfo()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f140f0d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvMeasureTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140f20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvTip()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->onTitleLeftClick$lambda$0$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->handlerMeasureErrorState$lambda$0$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z

    move-result p0

    return p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Landroid/view/View;)V
    .locals 0

    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->requestLocationPermission()V

    return-void

    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->requestEnableBluetooth()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->scan()V

    return-void
.end method

.method private static final llWeightMeasureInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0733

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final llWeightMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0732

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final onTitleLeftClick$lambda$0$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onTitleLeftClick$lambda$0$1(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->save()V

    const/4 p0, 0x1

    return p0
.end method

.method private final permissionBackgroundLocationRemind()V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mPermissionBackgroundPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1401a9

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiXX1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IiXX1;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mPermissionBackgroundPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mPermissionBackgroundPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final permissionRemind$lambda$0$0()Z
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    const/4 v0, 0x1

    return v0
.end method

.method private final requestEnableBluetooth()V
    .locals 6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/X1OOO;->IIX1OXO(Landroid/app/Activity;Ljava/lang/String;IIILjava/lang/Object;)V

    return-void
.end method

.method private final requestLocationPermission()V
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->permissionBackgroundLocationRemind()V

    return-void

    :cond_0
    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/i00OXI0;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/i00OXI0;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$OXO1;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->permissionRemind()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->scan()V

    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final save()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/model/AppUser;->setWeight(F)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    const-class v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    filled-new-array {v0}, [Lcom/sma/smartv3/db/entity/Weight;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/sma/smartv3/db/dao/WeightDao;->insert(Ljava/util/List;)[J

    const-string v1, "measure_weight_change"

    invoke-static {v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "weight_change"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private final scan()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->handlerMeasuringState()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mBleManager:Lcom/vtrump/vtble/iO;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/vtrump/vtble/iO;->XX1Oi()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mBleManager:Lcom/vtrump/vtble/iO;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xd6;

    const/4 v2, 0x6

    const/16 v3, 0xf

    const/4 v4, 0x3

    invoke-direct {v1, v4, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/xd6;-><init>(BBBB)V

    filled-new-array {v1}, [Lcom/android/mltcode/paycertificationapi/xd6;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    const/16 v2, 0x1e

    invoke-virtual {v0, v2, v1}, Lcom/vtrump/vtble/iO;->XOXOIX0Oi(ILjava/util/ArrayList;)V

    :cond_1
    return-void
.end method

.method private static final tvGreet_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c8b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvMeasureTip_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cbb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a188f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvWeightValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a18c9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-static {}, Lcom/vtrump/vtble/iO;->iOI()Lcom/vtrump/vtble/iO;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mBleManager:Lcom/vtrump/vtble/iO;

    if-eqz p1, :cond_0

    const-string v0, "7LKL5L3QEU1JFAGZ"

    invoke-virtual {p1, v0}, Lcom/vtrump/vtble/iO;->I0IIOI(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mBleManager:Lcom/vtrump/vtble/iO;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Lcom/vtrump/vtble/iO;->IX0iIX(Lcom/vtrump/vtble/iO$XIi00iiXO;)V

    :cond_1
    :try_start_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mBleManager:Lcom/vtrump/vtble/iO;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p0}, Lcom/vtrump/vtble/iO;->OI(Landroid/content/Context;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-void
.end method

.method public initView()V
    .locals 4

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140f22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080ffc

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getTvGreet()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getHours()I

    move-result v1

    const/4 v2, 0x6

    const/16 v3, 0xb

    if-gt v2, v1, :cond_0

    if-ge v1, v3, :cond_0

    const v1, 0x7f140c7b

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getHours()I

    move-result v1

    const/16 v2, 0xd

    if-gt v3, v1, :cond_1

    if-ge v1, v2, :cond_1

    const v1, 0x7f140c7c

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getHours()I

    move-result v1

    if-gt v2, v1, :cond_2

    const/16 v2, 0x13

    if-ge v1, v2, :cond_2

    const v1, 0x7f140c79

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const v1, 0x7f140c7a

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getBtnMeasureWeight()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IX0IO1X1i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IX0IO1X1i;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->handlerNoMeasureState()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0040

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mBleManager:Lcom/vtrump/vtble/iO;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/vtrump/vtble/iO;->O101()V

    :cond_0
    return-void
.end method

.method public onDeviceAdvDiscovered(Lcom/vtrump/vtble/VTDevice;)V
    .locals 2
    .param p1    # Lcom/vtrump/vtble/VTDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDeviceAdvDiscovered "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const-string v0, "null cannot be cast to non-null type com.vtrump.vtble.VTDeviceScale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/vtrump/vtble/XO0O10;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mVtDeviceScale:Lcom/vtrump/vtble/XO0O10;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->listener:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/vtrump/vtble/XO0O10;->XOXiX0(Lcom/vtrump/vtble/XO0O10$O00;)V

    :cond_0
    return-void
.end method

.method public onDeviceConnected(Lcom/vtrump/vtble/VTDevice;)V
    .locals 2
    .param p1    # Lcom/vtrump/vtble/VTDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDeviceConnected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->handlerNoMeasureState()V

    return-void
.end method

.method public onDeviceDisconnected(Lcom/vtrump/vtble/VTDevice;)V
    .locals 2
    .param p1    # Lcom/vtrump/vtble/VTDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDeviceDisconnected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->handlerUnconnectState()V

    return-void
.end method

.method public onDeviceDiscovered(Lcom/vtrump/vtble/VTDevice;I)V
    .locals 2
    .param p1    # Lcom/vtrump/vtble/VTDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDeviceDiscovered  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "  -- "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onDeviceServiceDiscovered(Lcom/vtrump/vtble/VTDevice;)V
    .locals 2
    .param p1    # Lcom/vtrump/vtble/VTDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDeviceServiceDiscovered "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const-string v0, "null cannot be cast to non-null type com.vtrump.vtble.VTDeviceScale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/vtrump/vtble/XO0O10;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mVtDeviceScale:Lcom/vtrump/vtble/XO0O10;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->listener:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/vtrump/vtble/XO0O10;->XOXiX0(Lcom/vtrump/vtble/XO0O10$O00;)V

    :cond_0
    return-void
.end method

.method public onInited()V
    .locals 1

    const-string v0, "onInited"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onScanStop()V
    .locals 1

    const-string v0, "onScanStop"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onScanTimeOut()V
    .locals 1

    const-string v0, "onScanTimeOut"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->handlerMeasureTimeoutState()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->isDone:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1411c7

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f140c53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1IOXIO1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I1IOXIO1;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO01O0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO01O0X;-><init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    const v1, 0x7f1411c4

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->save()V

    return-void
.end method

.method public final permissionRemind()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1410be

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1XXOIi01;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/I1XXOIi01;-><init>()V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method
