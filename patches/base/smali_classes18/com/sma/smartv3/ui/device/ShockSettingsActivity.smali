.class public final Lcom/sma/smartv3/ui/device/ShockSettingsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShockSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShockSettingsActivity.kt\ncom/sma/smartv3/ui/device/ShockSettingsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1563#2:142\n1634#2,3:143\n*S KotlinDebug\n*F\n+ 1 ShockSettingsActivity.kt\ncom/sma/smartv3/ui/device/ShockSettingsActivity\n*L\n42#1:142\n42#1:143,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\u5df2\u5e9f\u5f03"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nShockSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShockSettingsActivity.kt\ncom/sma/smartv3/ui/device/ShockSettingsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1563#2:142\n1634#2,3:143\n*S KotlinDebug\n*F\n+ 1 ShockSettingsActivity.kt\ncom/sma/smartv3/ui/device/ShockSettingsActivity\n*L\n42#1:142\n42#1:143,3\n*E\n"
    }
.end annotation


# instance fields
.field private mCirculationPopup:Lcom/android/mltcode/paycertificationapi/dj4;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mCirculations:Ljava/util/List;
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

.field private mShockModePopup:Lcom/android/mltcode/paycertificationapi/dj4;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mShockModes$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAlarmClockCirculation$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAlarmClockShockMode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvIncomingCallCirculation$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvIncomingCallShockMode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvMessagePushCirculation$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvMessagePushShockMode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvScheduleCirculation$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvScheduleShockMode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSedentaryCirculation$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSedentaryShockMode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qa4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qa4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ta4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ta4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvIncomingCallShockMode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ua4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ua4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvIncomingCallCirculation$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/va4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/va4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvAlarmClockShockMode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wa4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wa4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvAlarmClockCirculation$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xa4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xa4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvScheduleShockMode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/la4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/la4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvScheduleCirculation$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ma4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ma4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvSedentaryShockMode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/na4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/na4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvSedentaryCirculation$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/oa4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/oa4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvMessagePushShockMode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ra4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ra4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvMessagePushCirculation$delegate:Lkotlin/Lazy;

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XOIX(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sa4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sa4;-><init>(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mShockModes$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)[Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mShockModes_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvScheduleShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvAlarmClockCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvSedentaryCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvIncomingCallShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvAlarmClockShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(ILcom/sma/smartv3/ui/device/ShockSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->onItemClick$lambda$2$0(ILcom/sma/smartv3/ui/device/ShockSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvMessagePushShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvIncomingCallCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvSedentaryShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvMessagePushCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvScheduleCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private final getMShockModes()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mShockModes$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private final getTvAlarmClockCirculation()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvAlarmClockCirculation$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvAlarmClockShockMode()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvAlarmClockShockMode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvIncomingCallCirculation()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvIncomingCallCirculation$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvIncomingCallShockMode()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvIncomingCallShockMode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvMessagePushCirculation()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvMessagePushCirculation$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvMessagePushShockMode()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvMessagePushShockMode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvScheduleCirculation()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvScheduleCirculation$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvScheduleShockMode()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvScheduleShockMode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvSedentaryCirculation()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvSedentaryCirculation$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvSedentaryShockMode()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->tvSedentaryShockMode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public static synthetic iIiiO(ILcom/sma/smartv3/ui/device/ShockSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->onItemClick$lambda$0$0(ILcom/sma/smartv3/ui/device/ShockSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method private static final mShockModes_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)[Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f030045

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final onItemClick$lambda$0$0(ILcom/sma/smartv3/ui/device/ShockSettingsActivity;I)Z
    .locals 0

    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvSedentaryShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, p2

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :sswitch_1
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvScheduleShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, p2

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :sswitch_2
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvMessagePushShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, p2

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :sswitch_3
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvIncomingCallShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, p2

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :sswitch_4
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvAlarmClockShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, p2

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const/4 p0, 0x1

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0a06d0 -> :sswitch_4
        0x7f0a06fb -> :sswitch_3
        0x7f0a0707 -> :sswitch_2
        0x7f0a071e -> :sswitch_1
        0x7f0a0723 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final onItemClick$lambda$2$0(ILcom/sma/smartv3/ui/device/ShockSettingsActivity;I)Z
    .locals 0

    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvSedentaryCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    iget-object p1, p1, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :sswitch_1
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvScheduleCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    iget-object p1, p1, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :sswitch_2
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvMessagePushCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    iget-object p1, p1, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :sswitch_3
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvIncomingCallCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    iget-object p1, p1, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :sswitch_4
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvAlarmClockCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    iget-object p1, p1, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const/4 p0, 0x1

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0a06cf -> :sswitch_4
        0x7f0a06fa -> :sswitch_3
        0x7f0a0706 -> :sswitch_2
        0x7f0a071d -> :sswitch_1
        0x7f0a0722 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvAlarmClockCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c2a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvAlarmClockShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c2b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvIncomingCallCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c9a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvIncomingCallShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c9b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvMessagePushCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0cbc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvMessagePushShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0cbd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvScheduleCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0d02

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvScheduleShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0d03

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvSedentaryCirculation_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0d07

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvSedentaryShockMode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ShockSettingsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0d08

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method


# virtual methods
.method public final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 4

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f141232

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvIncomingCallShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvIncomingCallCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvAlarmClockShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvAlarmClockCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvScheduleShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvScheduleCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvSedentaryShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x3

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvSedentaryCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvMessagePushShockMode()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getMShockModes()[Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x4

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getTvMessagePushCirculation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0100

    return v0
.end method

.method public final onItemClick(Landroid/view/View;)V
    .locals 14
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const-string v0, "<get-rootView>(...)"

    const/4 v1, 0x0

    sparse-switch p1, :sswitch_data_0

    return-void

    :sswitch_0
    new-instance v2, Lcom/android/mltcode/paycertificationapi/dj4;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const v4, 0x7f030045

    const/4 v5, 0x0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/dj4;-><init>(Landroid/app/Activity;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v4, 0x7f14123b

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/ka4;

    invoke-direct {v4, p1, p0}, Lcom/android/mltcode/paycertificationapi/ka4;-><init>(ILcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/dj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object v2, v3, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mShockModePopup:Lcom/android/mltcode/paycertificationapi/dj4;

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    return-void

    :sswitch_1
    move-object v3, p0

    new-instance v8, Lcom/android/mltcode/paycertificationapi/dj4;

    iget-object v10, v3, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculations:Ljava/util/List;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v9, v3

    invoke-direct/range {v8 .. v13}, Lcom/android/mltcode/paycertificationapi/dj4;-><init>(Landroid/app/Activity;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x7f1402c8

    invoke-virtual {v8, v2}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/pa4;

    invoke-direct {v2, p1, p0}, Lcom/android/mltcode/paycertificationapi/pa4;-><init>(ILcom/sma/smartv3/ui/device/ShockSettingsActivity;)V

    invoke-virtual {v8, v2}, Lcom/android/mltcode/paycertificationapi/dj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object v8, v3, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->mCirculationPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    invoke-virtual {v8, v1}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ShockSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a06cf -> :sswitch_1
        0x7f0a06d0 -> :sswitch_0
        0x7f0a06fa -> :sswitch_1
        0x7f0a06fb -> :sswitch_0
        0x7f0a0706 -> :sswitch_1
        0x7f0a0707 -> :sswitch_0
        0x7f0a071d -> :sswitch_1
        0x7f0a071e -> :sswitch_0
        0x7f0a0722 -> :sswitch_1
        0x7f0a0723 -> :sswitch_0
    .end sparse-switch
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
