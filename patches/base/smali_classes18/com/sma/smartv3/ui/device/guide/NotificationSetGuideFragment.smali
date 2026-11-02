.class public final Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationSetGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSetGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n13805#2,2:186\n1#3:188\n*S KotlinDebug\n*F\n+ 1 NotificationSetGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment\n*L\n76#1:186,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNotificationSetGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSetGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n13805#2,2:186\n1#3:188\n*S KotlinDebug\n*F\n+ 1 NotificationSetGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment\n*L\n76#1:186,2\n*E\n"
    }
.end annotation


# instance fields
.field private checkCall:Landroid/widget/CheckBox;

.field private checkSms:Landroid/widget/CheckBox;

.field private defautListView:Landroid/widget/ListView;

.field private ll:Landroid/view/View;

.field private mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    return-void
.end method

.method public static synthetic XIi00iiXO(ZLcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->onCheckedChanged$lambda$0(ZLcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(ZLcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->onCheckedChanged$lambda$1(ZLcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->permissionRemind$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method private static final onCheckedChanged$lambda$0(ZLcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p3, v0, :cond_0

    sget-object p2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    const-string p3, "notification_call"

    invoke-virtual {p2, p3, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object p0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer;->IOI()V

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer;->IIX(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->permissionRemind()V

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {p2, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onCheckedChanged$lambda$1(ZLcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p3, v0, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string p2, "notification_sms"

    invoke-virtual {p1, p2, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object p0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer;->O0i()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->permissionRemind()V

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {p2, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final permissionRemind$lambda$0$0()Z
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    const/4 v0, 0x1

    return v0
.end method

.method private final showDefaultList()V
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->I1()[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v2, :cond_3

    aget-object v6, v1, v4

    :try_start_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    invoke-virtual {v7, v6, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v7, v5

    :goto_1
    if-eqz v7, :cond_0

    new-instance v5, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-direct {v5}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->IiI10X(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XOO0ii0(Ljava/lang/String;)V

    iget-object v6, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->I0IIOi(Ljava/lang/String;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    sget-object v7, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/i72;->O0Ii()Z

    move-result v7

    if-eqz v7, :cond_2

    sget-object v7, Lcom/android/mltcode/paycertificationapi/la1;->OXO1:Lcom/android/mltcode/paycertificationapi/la1;

    invoke-virtual {v7, v6}, Lcom/android/mltcode/paycertificationapi/la1;->OXO1(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v7

    invoke-virtual {v7}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v7}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-lez v9, :cond_2

    new-instance v9, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-direct {v9}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v10

    if-eqz v10, :cond_1

    invoke-virtual {v10, v8}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    :cond_1
    invoke-virtual {v9, v5}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->IiI10X(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v9, v7}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XOO0ii0(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->I0IIOi(Ljava/lang/String;)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment$OXO1;

    invoke-direct {v2, v0, v1}, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment$OXO1;-><init>(Ljava/util/List;Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->defautListView:Landroid/widget/ListView;

    if-nez v0, :cond_4

    const-string v0, "defautListView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    move-object v5, v0

    :goto_3
    invoke-virtual {v5, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
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

.method public initView()V
    .locals 8

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a06b5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->ll:Landroid/view/View;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0a022c

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->checkCall:Landroid/widget/CheckBox;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0a023a

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->checkSms:Landroid/widget/CheckBox;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0a02e1

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->defautListView:Landroid/widget/ListView;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OI()Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "checkCall"

    const-string v3, "notification_call"

    const-string v4, "ll"

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->ll:Landroid/view/View;

    if-nez v0, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v6

    :cond_0
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v3, v5}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->checkCall:Landroid/widget/CheckBox;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v6

    :cond_1
    if-eqz v0, :cond_2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/gb1;->OXO1()[Ljava/lang/String;

    move-result-object v0

    array-length v4, v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v5

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->ll:Landroid/view/View;

    if-nez v0, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v6

    :cond_4
    const/16 v4, 0x8

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v3, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    :goto_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v3, "notification_sms"

    invoke-virtual {v0, v3, v5}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->checkSms:Landroid/widget/CheckBox;

    const-string v4, "checkSms"

    if-nez v3, :cond_5

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v6

    :cond_5
    if-eqz v0, :cond_6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/gb1;->XIi00iiXO()[Ljava/lang/String;

    move-result-object v0

    array-length v7, v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    move v1, v5

    :goto_2
    invoke-virtual {v3, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->checkCall:Landroid/widget/CheckBox;

    if-nez v0, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v6

    :cond_7
    invoke-virtual {v0, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->checkSms:Landroid/widget/CheckBox;

    if-nez v0, :cond_8

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    move-object v6, v0

    :goto_3
    invoke-virtual {v6, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->showDefaultList()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e67

    return v0
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 9
    .param p1    # Landroid/widget/CompoundButton;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "buttonView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a022c

    const-string v2, "permission(...)"

    if-eq v0, v1, :cond_2

    const v1, 0x7f0a023a

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    const-string v0, "SMS"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lcom/android/mltcode/paycertificationapi/na1;

    invoke-direct {v6, p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/na1;-><init>(ZLcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;Landroid/widget/CompoundButton;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "notification_sms"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void

    :cond_2
    if-eqz p2, :cond_3

    const-string v0, "PHONE"

    const-string v1, "CONTACTS"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lcom/android/mltcode/paycertificationapi/ma1;

    invoke-direct {v6, p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/ma1;-><init>(ZLcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;Landroid/widget/CompoundButton;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_3
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "notification_call"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object p1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p1}, Lcom/sma/smartv3/initializer/BleInitializer;->IOI()V

    return-void
.end method

.method public final permissionRemind()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1410be

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v4, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/oa1;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/oa1;-><init>()V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    const v1, 0x7f0a09b5

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->X0O(I)V

    :cond_1
    return-void
.end method
