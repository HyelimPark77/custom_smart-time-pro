.class public final Lcom/sma/smartv3/ui/sport/SportDetailFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,152:1\n19#2:153\n15#2:154\n*S KotlinDebug\n*F\n+ 1 SportDetailFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailFragment\n*L\n52#1:153\n52#1:154\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,152:1\n19#2:153\n15#2:154\n*S KotlinDebug\n*F\n+ 1 SportDetailFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailFragment\n*L\n52#1:153\n52#1:154\n*E\n"
    }
.end annotation


# instance fields
.field private final airpressurePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final altitudePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final distancePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isLocationEmpty:Z

.field private final mLocationDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWorkout:Lcom/sma/smartv3/db/entity/Workout;

.field private final pacePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final pressurePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final speedPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final spmPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final stepPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAirpressureUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAirpressureValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAltitudeUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAltitudeValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAvgHrValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAvgPaceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAvgPaceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAvgSpeedUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAvgSpeedValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAvgSpmValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCaloriesValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDateTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDistanceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDistanceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDuration$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvPressureValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvStepValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->rootView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ku4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ku4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDateTime$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/su4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/su4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDuration$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/uu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvStepValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/vu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->stepPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/wu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgSpmValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/xu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->spmPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/yu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDistanceValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/zu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->distancePanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/av4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/av4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDistanceUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/tu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvCaloriesValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/bv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgHrValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/cv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgSpeedValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/dv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->speedPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ev4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ev4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgSpeedUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/fv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgPaceValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/gv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgPaceUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/hv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->pacePanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAltitudeValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ju4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ju4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAltitudeUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/lu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->altitudePanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/mu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAirpressureValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/nu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAirpressureUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ou4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ou4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->airpressurePanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/pu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvPressureValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qu4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/qu4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->pressurePanel$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ru4;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/ru4;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mLocationDao$delegate:Lkotlin/Lazy;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->isLocationEmpty:Z

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgHrValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDateTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAirpressureUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgSpmValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvCaloriesValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroidx/core/widget/NestedScrollView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroidx/core/widget/NestedScrollView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgPaceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDistanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgSpeedValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvStepValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvPressureValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->pressurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAirpressureValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->airpressurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->pacePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgPaceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->distancePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAltitudeValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->stepPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->speedPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->altitudePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final airpressurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00ad

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final altitudePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00b9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final distancePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0320

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final getAirpressurePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->airpressurePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getAltitudePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->altitudePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getDistancePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->distancePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mLocationDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/LocationDao;

    return-object v0
.end method

.method private final getPacePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->pacePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getPressurePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->pressurePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getRootView()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    return-object v0
.end method

.method private final getSpeedPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->speedPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getSpmPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->spmPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getStepPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->stepPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvAirpressureUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAirpressureUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAirpressureValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAirpressureValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAltitudeUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAltitudeUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAltitudeValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAltitudeValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAvgHrValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgHrValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAvgPaceUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgPaceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAvgPaceValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgPaceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAvgSpeedUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgSpeedUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAvgSpeedValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgSpeedValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAvgSpmValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgSpmValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvCaloriesValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvCaloriesValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDateTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDateTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDistanceUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDistanceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDistanceValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDistanceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDuration()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvDuration$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvPressureValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvPressureValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvStepValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvStepValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAvgSpeedUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->spmPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->tvAltitudeUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method private static final pacePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08e9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final pressurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a096e

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroidx/core/widget/NestedScrollView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    return-object p0
.end method

.method private static final speedPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a74

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final spmPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a8b

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final stepPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b37

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvAirpressureUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c28

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAirpressureValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c29

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAltitudeUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c33

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAltitudeValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c34

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAvgHrValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c97

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAvgPaceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0cdf

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAvgPaceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0ce0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAvgSpeedUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0d10

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAvgSpeedValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0d11

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvAvgSpmValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0d12

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvCaloriesValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c4c

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDateTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c64

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c6f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDistanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c70

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c72

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvPressureValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0cee

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvStepValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0d1a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

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
    .locals 11

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg3()Ljava/io/Serializable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/db/entity/Workout;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    const-string v2, "mWorkout"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v4

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v6

    invoke-interface {v0, v4, v5, v6, v7}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-nez v1, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, v5, :cond_2

    goto :goto_0

    :cond_2
    move v0, v6

    goto :goto_1

    :cond_3
    :goto_0
    move v0, v4

    :goto_1
    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->isLocationEmpty:Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a041c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/gridlayout/widget/GridLayout;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvDateTime()Landroid/widget/TextView;

    move-result-object v1

    const/4 v7, 0x3

    invoke-static {v6, v6, v7, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v7

    new-instance v8, Ljava/util/Date;

    iget-object v9, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v9, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v9, v3

    :cond_4
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v9

    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v7, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvDuration()Landroid/widget/TextView;

    move-result-object v1

    iget-object v7, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v7, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v3

    :cond_5
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v7

    mul-int/lit16 v7, v7, 0x3e8

    invoke-static {v7}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvCaloriesValue()Landroid/widget/TextView;

    move-result-object v1

    iget-object v7, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v7, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v3

    :cond_6
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v7

    div-int/lit16 v7, v7, 0x3e8

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAvgHrValue()Landroid/widget/TextView;

    move-result-object v1

    iget-object v7, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v7, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v3

    :cond_7
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgBpm()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    iget-object v7, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v7, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v3

    :cond_8
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v7

    invoke-virtual {v1, v7}, Lcom/android/mltcode/paycertificationapi/q62;->O1XXXX(I)Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvStepValue()Landroid/widget/TextView;

    move-result-object v7

    iget-object v8, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v8, :cond_9

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v3

    :cond_9
    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMStep()I

    move-result v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAvgSpmValue()Landroid/widget/TextView;

    move-result-object v7

    iget-object v8, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v8, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v3

    :cond_a
    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMSpm()I

    move-result v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_b
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getStepPanel()Landroid/view/View;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getSpmPanel()Landroid/view/View;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :goto_2
    iget-object v7, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v7, :cond_c

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v3

    :cond_c
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v7

    invoke-static {v1, v7, v6, v5, v3}, Lcom/android/mltcode/paycertificationapi/q62;->X0XI11I(Lcom/android/mltcode/paycertificationapi/q62;IZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvDistanceValue()Landroid/widget/TextView;

    move-result-object v5

    iget-object v7, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v7, :cond_d

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v3

    :cond_d
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v7

    iget-object v8, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v8}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v8

    const/4 v9, 0x4

    invoke-static {v7, v8, v6, v9, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvDistanceUnit()Landroid/widget/TextView;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v6

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v6

    invoke-virtual {p0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAvgSpeedValue()Landroid/widget/TextView;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v6, :cond_e

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v3

    :cond_e
    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeed()I

    move-result v6

    int-to-double v6, v6

    const-wide v8, 0x408f400000000000L    # 1000.0

    div-double/2addr v6, v8

    iget-object v8, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v8}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v8

    invoke-static {v6, v7, v8}, Lcom/android/mltcode/paycertificationapi/cp5;->i11I(DI)F

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAvgSpeedUnit()Landroid/widget/TextView;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v6

    if-nez v6, :cond_f

    const v6, 0x7f140d71

    goto :goto_3

    :cond_f
    const v6, 0x7f140f48

    :goto_3
    invoke-virtual {p0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAvgPaceValue()Landroid/widget/TextView;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v6, :cond_10

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v3

    :cond_10
    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result v6

    iget-object v7, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v7

    invoke-static {v6, v7}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAvgPaceUnit()Landroid/widget/TextView;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v6

    if-nez v6, :cond_11

    const v6, 0x7f14108c

    goto :goto_4

    :cond_11
    const v6, 0x7f14108e

    :goto_4
    invoke-virtual {p0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_12
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getDistancePanel()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getSpeedPanel()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getPacePanel()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :goto_5
    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v5, :cond_13

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_13
    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v5

    iget-boolean v6, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->isLocationEmpty:Z

    xor-int/2addr v4, v6

    invoke-virtual {v1, v5, v4}, Lcom/android/mltcode/paycertificationapi/q62;->I1XXi1Oi(IZ)Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAltitudeValue()Landroid/widget/TextView;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v5, :cond_14

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_14
    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMAltitude()I

    move-result v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v6

    invoke-static {v5, v6}, Lcom/android/mltcode/paycertificationapi/cp5;->iIXi1iiXI(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAltitudeUnit()Landroid/widget/TextView;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    if-nez v5, :cond_15

    const v5, 0x7f140e4e

    goto :goto_6

    :cond_15
    const v5, 0x7f141620

    :goto_6
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_7

    :cond_16
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getAltitudePanel()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :goto_7
    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v4, :cond_17

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_17
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMAirPressure()I

    move-result v4

    if-eqz v4, :cond_1c

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAirpressureValue()Landroid/widget/TextView;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    if-nez v5, :cond_19

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v5, :cond_18

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_18
    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMAirPressure()I

    move-result v5

    goto :goto_8

    :cond_19
    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v5, :cond_1a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_1a
    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMAirPressure()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->X0i1O(I)D

    move-result-wide v5

    double-to-int v5, v5

    :goto_8
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvAirpressureUnit()Landroid/widget/TextView;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    if-nez v5, :cond_1b

    const v5, 0x7f140d74

    goto :goto_9

    :cond_1b
    const v5, 0x7f141133

    :goto_9
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_a

    :cond_1c
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getAirpressurePanel()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :goto_a
    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v4, :cond_1d

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_1d
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/android/mltcode/paycertificationapi/q62;->OOX(I)Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getTvPressureValue()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v1, :cond_1e

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_b

    :cond_1e
    move-object v3, v1

    :goto_b
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgStress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1f
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getPressurePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e82

    return v0
.end method

.method public final share()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->getRootView()Landroidx/core/widget/NestedScrollView;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->iO(Landroidx/core/widget/NestedScrollView;)Landroid/graphics/Bitmap;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XOX0O0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    return-void
.end method
