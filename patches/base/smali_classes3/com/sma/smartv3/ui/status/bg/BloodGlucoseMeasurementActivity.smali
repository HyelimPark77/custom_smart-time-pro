.class public final Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodGlucoseMeasurementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseMeasurementActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,305:1\n1563#2:306\n1634#2,2:307\n1636#2:316\n1869#2:319\n1870#2:325\n277#3,5:309\n277#3,5:320\n37#4,2:314\n37#4,2:317\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseMeasurementActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity\n*L\n169#1:306\n169#1:307,2\n169#1:316\n240#1:319\n240#1:325\n171#1:309,5\n250#1:320,5\n171#1:314,2\n179#1:317,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodGlucoseMeasurementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseMeasurementActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,305:1\n1563#2:306\n1634#2,2:307\n1636#2:316\n1869#2:319\n1870#2:325\n277#3,5:309\n277#3,5:320\n37#4,2:314\n37#4,2:317\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseMeasurementActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity\n*L\n169#1:306\n169#1:307,2\n169#1:316\n240#1:319\n240#1:325\n171#1:309,5\n250#1:320,5\n171#1:314,2\n179#1:317,2\n*E\n"
    }
.end annotation


# instance fields
.field private final btnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivIcMeasurement$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llMeasurement$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBGEMRangeAnalysis:Lcom/sma/smartv3/model/BGEMRangeAnalysis;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mMeasurementList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMeasurement;",
            ">;"
        }
    .end annotation
.end field

.field private final tvInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II0110;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/II0110;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->llMeasurement$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0X11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0X11;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->ivIcMeasurement$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0I0i01iO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0I0i01iO;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->tvValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI0IOOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI0IOOI;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->tvUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiI0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiI0O;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->tvInfo$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0O0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0O0I;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->btnBottom$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;-><init>(ZZLjava/lang/String;Ljava/lang/String;I[Lcom/sma/smartv3/model/BGEMPpg;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBGEMRangeAnalysis:Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mMeasurementList:Ljava/util/List;

    new-instance v0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->measurementStart$lambda$1(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->llMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->tvUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->showMessureFailedPopup$lambda$0$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->tvInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->tvValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->ivIcMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->analysis$lambda$1(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$analysis(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->analysis()V

    return-void
.end method

.method public static final synthetic access$getMMeasurementList$p(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mMeasurementList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getTvValue(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$measurementEnd(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->measurementEnd()V

    return-void
.end method

.method public static final synthetic access$showMessureFailedPopup(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->showMessureFailedPopup()V

    return-void
.end method

.method private final analysis()V
    .locals 11

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->showLoading()V

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBGEMRangeAnalysis:Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->setFasting(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBGEMRangeAnalysis:Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->setNBit(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBGEMRangeAnalysis:Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mMeasurementList:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/szabh/smable3/entity/BleMeasurement;

    new-instance v5, Lcom/sma/smartv3/model/BGEMPpg;

    sget-object v6, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMeasurement;->getMPacket()[B

    move-result-object v6

    array-length v7, v6

    const-class v8, Lcom/szabh/smable3/entity/BleMeasurementPPG;

    invoke-virtual {v8}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-static {v6, v4, v7}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v6

    invoke-virtual {v9, v6}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v9}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-string v6, "also(...)"

    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Lcom/bestmafen/baseble/data/BleReadable;

    check-cast v8, Lcom/szabh/smable3/entity/BleMeasurementPPG;

    invoke-virtual {v8}, Lcom/szabh/smable3/entity/BleMeasurementPPG;->getMPpgData()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    new-array v4, v4, [Ljava/lang/Integer;

    invoke-interface {v6, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/Integer;

    sget-object v6, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const-string v6, "%02d:%02d:%02d"

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMeasurement;->getMHour()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMeasurement;->getMMinute()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMeasurement;->getMSecond()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v7, v8, v3}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v7, 0x3

    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "format(...)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v4, v3}, Lcom/sma/smartv3/model/BGEMPpg;-><init>([Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-array v1, v4, [Lcom/sma/smartv3/model/BGEMPpg;

    invoke-interface {v2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/sma/smartv3/model/BGEMPpg;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->setPpgData([Lcom/sma/smartv3/model/BGEMPpg;)V

    sget-object v0, Lcom/sma/smartv3/biz/BGEMManager;->OXO1:Lcom/sma/smartv3/biz/BGEMManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBGEMRangeAnalysis:Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    new-instance v2, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/biz/BGEMManager;->OXO1(Ljava/lang/Object;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    new-instance v8, Lcom/android/mltcode/paycertificationapi/iO0XOX0;

    invoke-direct {v8, p0}, Lcom/android/mltcode/paycertificationapi/iO0XOX0;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final analysis$lambda$1(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Lkotlin/Unit;
    .locals 20

    move-object/from16 v0, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".json"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBGEMRangeAnalysis:Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v9, 0x0

    const/4 v10, 0x2

    invoke-static {v2, v1, v9, v10, v9}, Lcom/android/mltcode/paycertificationapi/iI0OiO;->IO(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    iget-object v0, v0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mMeasurementList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleMeasurement;

    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMeasurement;->getMHour()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMeasurement;->getMMinute()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMeasurement;->getMSecond()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMeasurement;->getMMillisecond()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v2, v4, v5, v6}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x4

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v4, "%02d:%02d:%02d:%03d"

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "format(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMeasurement;->getMPacket()[B

    move-result-object v1

    array-length v4, v1

    const-class v5, Lcom/szabh/smable3/entity/BleMeasurementPPG;

    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v7, 0x0

    invoke-static {v1, v7, v4}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v1

    invoke-virtual {v6, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v6}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-string v1, "also(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/szabh/smable3/entity/BleMeasurementPPG;

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleMeasurementPPG;->getMPpgData()Ljava/util/List;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/lang/Iterable;

    const/16 v18, 0x3e

    const/16 v19, 0x0

    const-string v12, ","

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v11 .. v19}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XOiXXOO(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, ".json"

    const-string v5, ".csv"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-static {v2, v1, v9, v10, v9}, Lcom/android/mltcode/paycertificationapi/iI0OiO;->IO(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private static final btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final getBtnBottom()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->btnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getIvIcMeasurement()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->ivIcMeasurement$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getLlMeasurement()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->llMeasurement$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method private final getTvInfo()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->tvInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->tvUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvValue()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->tvValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->showMessureFailedPopup$lambda$0$1(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Z

    move-result p0

    return p0
.end method

.method private final isMeasuring()Z
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f140f29

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private static final ivIcMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0637

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final llMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a0705

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private final measurementEnd()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140f23

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const-string v1, "100"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->stop()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBGEMRangeAnalysis:Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->setEnd(Ljava/lang/String;)V

    return-void
.end method

.method private final measurementStart()V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBGEMRangeAnalysis:Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "format(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->setStart(Ljava/lang/String;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mMeasurementList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v2, v1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->start()V

    :cond_0
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f140f29

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    const v2, 0x7f1403bc

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v4, Lcom/szabh/smable3/BleKey;->MEASUREMENT:Lcom/szabh/smable3/BleKey;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v6, Lcom/szabh/smable3/entity/BleMeasurement;

    const/16 v18, 0x7fc

    const/16 v19, 0x0

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

    invoke-direct/range {v6 .. v19}, Lcom/szabh/smable3/entity/BleMeasurement;-><init>(IIIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v9, 0x18

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OI011;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/OI011;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x8

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final measurementStart$lambda$1(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->isMeasuring()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "measure timeout detect"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->showMessureFailedPopup()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method

.method private final showLoading()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private final showMessureFailedPopup()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140f14

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f140f28

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XO0O;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XO0O;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iIi0XI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iIi0XI;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    const v2, 0x7f140f1d

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1403bc

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->measurementEnd()V

    return-void
.end method

.method private static final showMessureFailedPopup$lambda$0$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final showMessureFailedPopup$lambda$0$1(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->measurementStart()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final tvInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c9c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a18ab

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a18b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method


# virtual methods
.method public final dismissLoading()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 3

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140f0e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getLlMeasurement()Landroid/view/ViewGroup;

    move-result-object v0

    const v1, 0x7f08073e

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0604f5

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->getTvUnit()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1410b6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->measurementStart()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d003a

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
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

.method public onDestroy()V
    .locals 23

    invoke-super/range {p0 .. p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    move-object/from16 v8, p0

    iget-object v1, v8, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->MEASUREMENT:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v3, Lcom/szabh/smable3/entity/BleMeasurement;

    const/16 v21, 0x7fc

    const/16 v22, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v9, v3

    invoke-direct/range {v9 .. v22}, Lcom/szabh/smable3/entity/BleMeasurement;-><init>(IIIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

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
