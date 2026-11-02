.class public final Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/github/appintro/SlideSelectionListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPersonalActivityFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalActivityFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n99#2,7:125\n106#2,3:133\n79#2,7:136\n109#2:143\n1#3:132\n*S KotlinDebug\n*F\n+ 1 PersonalActivityFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment\n*L\n54#1:125,7\n54#1:133,3\n54#1:136,7\n54#1:143\n54#1:132\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPersonalActivityFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalActivityFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n99#2,7:125\n106#2,3:133\n79#2,7:136\n109#2:143\n1#3:132\n*S KotlinDebug\n*F\n+ 1 PersonalActivityFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment\n*L\n54#1:125,7\n54#1:133,3\n54#1:136,7\n54#1:143\n54#1:132\n*E\n"
    }
.end annotation


# instance fields
.field private isSpan:Z

.field private final mAthleticView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBeginnerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mChallengerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mElementaryView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mGoalView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mIntermediateView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mLayoutView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTipImgView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTipTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hs1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hs1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mBeginnerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/is1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/is1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mElementaryView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/js1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/js1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mIntermediateView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ks1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ks1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mChallengerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ls1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ls1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mAthleticView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ms1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ms1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mGoalView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ns1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ns1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mTipTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/os1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/os1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mLayoutView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ps1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ps1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mTipImgView$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mTipImgView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mBeginnerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mTipTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mIntermediateView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mAthleticView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mChallengerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mGoalView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mLayoutView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mElementaryView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;Landroid/view/View;)V
    .locals 3

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const-string v1, "https://api.iot-solution.net/web/help/ai_coach_about_mets.html"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final mAthleticView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a025c

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mBeginnerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a025d

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mChallengerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a025e

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mElementaryView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a025f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mGoalView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0902

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mIntermediateView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0260

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mLayoutView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01d1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mTipImgView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a090b

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mTipTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b25

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final setRank(I)V
    .locals 10

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f06024d

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "<get-mBeginnerView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v3}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString(Landroid/widget/TextView;F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMElementaryView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMElementaryView()Landroid/widget/TextView;

    move-result-object v0

    const-string v4, "<get-mElementaryView>(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v3}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString(Landroid/widget/TextView;F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMIntermediateView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMIntermediateView()Landroid/widget/TextView;

    move-result-object v0

    const-string v5, "<get-mIntermediateView>(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v3}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString(Landroid/widget/TextView;F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMChallengerView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMChallengerView()Landroid/widget/TextView;

    move-result-object v0

    const-string v6, "<get-mChallengerView>(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v3}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString(Landroid/widget/TextView;F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMAthleticView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMAthleticView()Landroid/widget/TextView;

    move-result-object v0

    const-string v2, "<get-mAthleticView>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v3}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString(Landroid/widget/TextView;F)V

    const/4 v0, 0x1

    const v3, 0x7f06074b

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x2

    if-eq p1, v0, :cond_4

    if-eq p1, v9, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    const/4 v1, 0x5

    if-eq p1, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMAthleticView()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, v8, v9, v7}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString$default(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;Landroid/widget/TextView;FILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMAthleticView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMChallengerView()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, v8, v9, v7}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString$default(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;Landroid/widget/TextView;FILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMChallengerView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMIntermediateView()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, v8, v9, v7}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString$default(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;Landroid/widget/TextView;FILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMIntermediateView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMElementaryView()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, v8, v9, v7}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString$default(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;Landroid/widget/TextView;FILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMElementaryView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, v8, v9, v7}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString$default(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;Landroid/widget/TextView;FILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMBeginnerView()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :goto_0
    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->isSpan:Z

    return-void
.end method

.method public static synthetic setRank$default(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;IILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setRank(I)V

    return-void
.end method

.method private final setTextSpannableString(Landroid/widget/TextView;F)V
    .locals 4

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->isSpan:Z

    if-eqz v0, :cond_0

    const v0, 0x3fa66666    # 1.3f

    cmpg-float v0, p2, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Landroid/text/style/RelativeSizeSpan;

    invoke-direct {v2, p2}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/16 v0, 0x21

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, p2, v0}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic setTextSpannableString$default(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;Landroid/widget/TextView;FILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const p2, 0x3fa66666    # 1.3f

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setTextSpannableString(Landroid/widget/TextView;F)V

    return-void
.end method


# virtual methods
.method public final getMAthleticView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mAthleticView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMBeginnerView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mBeginnerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMChallengerView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mChallengerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMElementaryView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mElementaryView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMGoalView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mGoalView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMIntermediateView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mIntermediateView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMLayoutView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mLayoutView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getMTipImgView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mTipImgView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getMTipTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->mTipTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

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
    .locals 8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMLayoutView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-mLayoutView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {v0, v1}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMTipTitle()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMTipTitle()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f06024d

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v7, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v2, 0x7f140254

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/16 v2, 0x21

    invoke-virtual {v0, v7, v3, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMTipTitle()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMTipImgView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qs1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qs1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final isSpan()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->isSpan:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0175

    return v0
.end method

.method public onSlideDeselected()V
    .locals 0

    return-void
.end method

.method public onSlideSelected()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->getMGoalView()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getPlanTarget()F

    move-result v2

    float-to-int v2, v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getLevel()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->setRank(I)V

    return-void
.end method

.method public final setSpan(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;->isSpan:Z

    return-void
.end method
