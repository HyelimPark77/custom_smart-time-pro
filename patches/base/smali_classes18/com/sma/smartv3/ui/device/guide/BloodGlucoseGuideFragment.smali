.class public final Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/github/appintro/SlideSelectionListener;


# instance fields
.field private tvNo:Landroid/widget/TextView;

.field private tvYes:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;Landroid/view/View;)V
    .locals 3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "IS_FAMILY_HISTORY"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvYes:Landroid/widget/TextView;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "tvYes"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600b4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvNo:Landroid/widget/TextView;

    if-nez p1, :cond_1

    const-string p1, "tvNo"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, p1

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const p1, 0x7f06024a

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;Landroid/view/View;)V
    .locals 3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "IS_FAMILY_HISTORY"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvYes:Landroid/widget/TextView;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "tvYes"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f06024a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvNo:Landroid/widget/TextView;

    if-nez p1, :cond_1

    const-string p1, "tvNo"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, p1

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const p1, 0x7f0600b4

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

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
    .locals 4

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a18cd

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvYes:Landroid/widget/TextView;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string v0, "tvYes"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    new-instance v3, Lcom/android/mltcode/paycertificationapi/X1OI0O0;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/X1OI0O0;-><init>(Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v3, 0x7f0a0cce

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvNo:Landroid/widget/TextView;

    if-nez v0, :cond_1

    const-string v0, "tvNo"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXXIiiO10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXXIiiO10;-><init>(Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e66

    return v0
.end method

.method public onSlideDeselected()V
    .locals 0

    return-void
.end method

.method public onSlideSelected()V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "IS_FAMILY_HISTORY"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodGlucoseGuideFragment onSlideSelected isFamilyHistory = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const v1, 0x7f06024a

    const-string v2, "tvNo"

    const v3, 0x7f0600b4

    const-string v4, "tvYes"

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvYes:Landroid/widget/TextView;

    if-nez v0, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvNo:Landroid/widget/TextView;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v5, v0

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvYes:Landroid/widget/TextView;

    if-nez v0, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;->tvNo:Landroid/widget/TextView;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v5, v0

    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method
