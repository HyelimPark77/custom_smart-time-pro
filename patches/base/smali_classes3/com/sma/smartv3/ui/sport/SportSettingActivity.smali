.class public final Lcom/sma/smartv3/ui/sport/SportSettingActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSettingActivity.kt\ncom/sma/smartv3/ui/sport/SportSettingActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n69#2,3:59\n72#2,5:63\n1#3:62\n*S KotlinDebug\n*F\n+ 1 SportSettingActivity.kt\ncom/sma/smartv3/ui/sport/SportSettingActivity\n*L\n56#1:59,3\n56#1:63,5\n56#1:62\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSettingActivity.kt\ncom/sma/smartv3/ui/sport/SportSettingActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n69#2,3:59\n72#2,5:63\n1#3:62\n*S KotlinDebug\n*F\n+ 1 SportSettingActivity.kt\ncom/sma/smartv3/ui/sport/SportSettingActivity\n*L\n56#1:59,3\n56#1:63,5\n56#1:62\n*E\n"
    }
.end annotation


# instance fields
.field private final llVoiceBroadcast$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final screenAlwaysOnCB$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final voiceBroadcastCB$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/s45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/s45;-><init>(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->screenAlwaysOnCB$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/t45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/t45;-><init>(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->llVoiceBroadcast$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/u45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/u45;-><init>(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->voiceBroadcastCB$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->llVoiceBroadcast_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->screenAlwaysOnCB_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->initView$lambda$0(Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->voiceBroadcastCB_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "buttonView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    const-string v0, "SPORT_SCREEN_ALWAY_ON"

    invoke-virtual {p0, v0, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    const/4 p0, 0x0

    const/4 p1, 0x2

    invoke-static {v0, p0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final initView$lambda$1(Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "buttonView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    const-string v0, "SPORT_SETTING_VOICE_BROADCAST"

    invoke-virtual {p0, v0, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method private static final llVoiceBroadcast_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a06c7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final screenAlwaysOnCB_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    const v0, 0x7f0a09e4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object p0
.end method

.method private static final voiceBroadcastCB_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportSettingActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    const v0, 0x7f0a190d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object p0
.end method


# virtual methods
.method public final getLlVoiceBroadcast()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->llVoiceBroadcast$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getScreenAlwaysOnCB()Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->screenAlwaysOnCB$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object v0
.end method

.method public final getVoiceBroadcastCB()Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->voiceBroadcastCB$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatCheckBox;

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
    .locals 3

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14122c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->getScreenAlwaysOnCB()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "SPORT_SCREEN_ALWAY_ON"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportSettingActivity;->getScreenAlwaysOnCB()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/r45;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/r45;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0119

    return v0
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

.method public final sportPermissionSetClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/PermissionSettingsActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
