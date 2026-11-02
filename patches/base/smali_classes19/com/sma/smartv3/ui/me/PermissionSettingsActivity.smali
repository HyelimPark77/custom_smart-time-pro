.class public final Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPermissionSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionSettingsActivity.kt\ncom/sma/smartv3/ui/me/PermissionSettingsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n87#2,7:167\n94#2,3:175\n70#2,7:178\n97#2:185\n1#3:174\n*S KotlinDebug\n*F\n+ 1 PermissionSettingsActivity.kt\ncom/sma/smartv3/ui/me/PermissionSettingsActivity\n*L\n77#1:167,7\n77#1:175,3\n77#1:178,7\n77#1:185\n77#1:174\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPermissionSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionSettingsActivity.kt\ncom/sma/smartv3/ui/me/PermissionSettingsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n87#2,7:167\n94#2,3:175\n70#2,7:178\n97#2:185\n1#3:174\n*S KotlinDebug\n*F\n+ 1 PermissionSettingsActivity.kt\ncom/sma/smartv3/ui/me/PermissionSettingsActivity\n*L\n77#1:167,7\n77#1:175,3\n77#1:178,7\n77#1:185\n77#1:174\n*E\n"
    }
.end annotation


# instance fields
.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvActivityState$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvBatteryState$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvContactState$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvLocationPermissionsText$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvLocationState$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvNotificationState$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvPhoneState$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSmsState$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvStoreState$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ir1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ir1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rr1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rr1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvNotificationState$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sr1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sr1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvLocationState$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tr1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tr1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvContactState$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ur1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ur1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvPhoneState$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vr1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vr1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvSmsState$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wr1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wr1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvStoreState$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xr1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xr1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvBatteryState$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yr1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yr1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvActivityState$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zr1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zr1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvLocationPermissionsText$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->onItemClick$lambda$5(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->onItemClick$lambda$3(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvLocationPermissionsText_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvContactState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvPhoneState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvBatteryState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->onItemClick$lambda$0(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->onItemClick$lambda$4(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->onItemClick$lambda$1(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->onItemClick$lambda$2(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->onItemClick$lambda$7(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvNotificationState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvStoreState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvLocationState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvSmsState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final getTvActivityState()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvActivityState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvBatteryState()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvBatteryState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvContactState()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvContactState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvLocationPermissionsText()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvLocationPermissionsText$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvLocationState()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvLocationState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvNotificationState()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvNotificationState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvPhoneState()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvPhoneState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvSmsState()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvSmsState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvStoreState()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvStoreState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->tvActivityState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->onItemClick$lambda$6(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onItemClick$lambda$0(Z)Lkotlin/Unit;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, "show_location_popup"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onItemClick$lambda$1(Z)Lkotlin/Unit;
    .locals 0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onItemClick$lambda$2(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/initializer/BleInitializer;->IIX(Landroid/content/Context;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onItemClick$lambda$3(Z)Lkotlin/Unit;
    .locals 0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onItemClick$lambda$4(Z)Lkotlin/Unit;
    .locals 0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onItemClick$lambda$5(Z)Lkotlin/Unit;
    .locals 0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onItemClick$lambda$6(Z)Lkotlin/Unit;
    .locals 0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onItemClick$lambda$7(Z)Lkotlin/Unit;
    .locals 0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvActivityState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c22

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvBatteryState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c3f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvContactState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c59

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvLocationPermissionsText_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0caf

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvLocationState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cad

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvNotificationState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cd5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvPhoneState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0ce3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvSmsState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d0d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvStoreState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d1b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

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

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 6

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1410bf

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->getTvNotificationState()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O001I:Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;

    invoke-virtual {v1, p0}, Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;->O00(Landroid/content/Context;)Z

    move-result v1

    const v2, 0x7f1410c0

    const v3, 0x7f1410c1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->getTvLocationState()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->X00Xi1X(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->getTvContactState()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->XO0X10iO(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v3

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->getTvPhoneState()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->X1(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v3

    goto :goto_3

    :cond_3
    move v4, v2

    :goto_3
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->getTvSmsState()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->IO0II0i(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v3

    goto :goto_4

    :cond_4
    move v4, v2

    :goto_4
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->getTvStoreState()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->Ii0X0X(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v3

    goto :goto_5

    :cond_5
    move v4, v2

    :goto_5
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->getTvBatteryState()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->XXiIiX10(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_6

    move v4, v3

    goto :goto_6

    :cond_6
    move v4, v2

    :goto_6
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->getTvActivityState()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->XOX0O0(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_7

    move v2, v3

    :cond_7
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->getTvLocationPermissionsText()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppName()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f140e2d

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a06cb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {}, Lcom/blankj/utilcode/util/RomUtils;->isXiaomi()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_8

    move v1, v3

    goto :goto_7

    :cond_8
    move v1, v2

    :goto_7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a06ca

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->IOI0i0I()Z

    move-result v4

    if-eqz v4, :cond_9

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v4, v5, :cond_9

    move v4, v3

    goto :goto_8

    :cond_9
    move v4, v2

    :goto_8
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a0726

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x21

    if-lt v4, v5, :cond_a

    move v4, v2

    goto :goto_9

    :cond_a
    move v4, v3

    :goto_9
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a0713

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->iXi()Z

    move-result v1

    if-eqz v1, :cond_b

    move v2, v3

    :cond_b
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00dd

    return v0
.end method

.method public final onItemClick(Landroid/view/View;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    return-void

    :sswitch_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->Ii0X0X(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nr1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/nr1;-><init>()V

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/hr1;->iX(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    return-void

    :sswitch_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->IO0II0i(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mr1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/mr1;-><init>()V

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/hr1;->X11I(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    return-void

    :sswitch_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->X1(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lr1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/lr1;-><init>(Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;)V

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/hr1;->XXO(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    return-void

    :sswitch_3
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppName()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/blankj/utilcode/util/RomUtils;->getRomInfo()Lcom/blankj/utilcode/util/RomUtils$RomInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/RomUtils$RomInfo;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/i72;->iOO1ii1(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://api.iot-solution.net/web/guide/dist/?&app="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&pid=58&phoneName="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&lang="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :sswitch_4
    sget-object p1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O001I:Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;->I0IIOi(Landroid/content/Context;)V

    return-void

    :sswitch_5
    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->X00Xi1X(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_3

    new-instance v4, Lcom/android/mltcode/paycertificationapi/jr1;

    invoke-direct {v4}, Lcom/android/mltcode/paycertificationapi/jr1;-><init>()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Lcom/android/mltcode/paycertificationapi/hr1;->X0i1O(Lcom/android/mltcode/paycertificationapi/hr1;Landroid/content/Context;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_3
    move-object v1, p0

    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    return-void

    :sswitch_6
    move-object v1, p0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->XO0X10iO(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kr1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/kr1;-><init>()V

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/hr1;->II1Xi0(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_4
    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    return-void

    :sswitch_7
    move-object v1, p0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->XXiIiX10(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/or1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/or1;-><init>()V

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/hr1;->iOO1ii1(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_5
    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    return-void

    :sswitch_8
    move-object v1, p0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pr1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/pr1;-><init>()V

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/hr1;->OII(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void

    :sswitch_9
    move-object v1, p0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->Ii0i(Landroid/content/Context;)V

    return-void

    :sswitch_a
    move-object v1, p0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->XOX0O0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_6

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qr1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/qr1;-><init>()V

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/hr1;->iIiiO(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_6
    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a06ca -> :sswitch_a
        0x7f0a06cb -> :sswitch_9
        0x7f0a06d2 -> :sswitch_8
        0x7f0a06d4 -> :sswitch_7
        0x7f0a06dd -> :sswitch_6
        0x7f0a0703 -> :sswitch_5
        0x7f0a070f -> :sswitch_4
        0x7f0a0712 -> :sswitch_3
        0x7f0a0715 -> :sswitch_2
        0x7f0a0725 -> :sswitch_1
        0x7f0a0726 -> :sswitch_0
    .end sparse-switch
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;->initView()V

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
