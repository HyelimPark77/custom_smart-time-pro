.class public final Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# instance fields
.field private final mIntroduceTextView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mProgressMarkers:Lcom/sma/smartv3/model/ProgressMarkers;

.field private final mRoundPicImage$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTitleTextView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1i1i0XO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1i1i0XO;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mRoundPicImage$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0iIXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0iIXX;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mTitleTextView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1Ii1001X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1Ii1001X;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mIntroduceTextView$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mTitleTextView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mIntroduceTextView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mRoundPicImage_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final mIntroduceTextView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a05dd

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mRoundPicImage_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a05e0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mTitleTextView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a05e1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getMIntroduceTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mIntroduceTextView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMRoundPicImage()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mRoundPicImage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMTitleTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mTitleTextView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.ProgressMarkers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/ProgressMarkers;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mProgressMarkers:Lcom/sma/smartv3/model/ProgressMarkers;

    return-void
.end method

.method public final initImage()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->getMRoundPicImage()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mProgressMarkers:Lcom/sma/smartv3/model/ProgressMarkers;

    if-nez v1, :cond_0

    const-string v1, "mProgressMarkers"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/ProgressMarkers;->getCoverUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->initImage()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->getMTitleTextView()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mProgressMarkers:Lcom/sma/smartv3/model/ProgressMarkers;

    const/4 v2, 0x0

    const-string v3, "mProgressMarkers"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/ProgressMarkers;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->getMIntroduceTextView()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->mProgressMarkers:Lcom/sma/smartv3/model/ProgressMarkers;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    invoke-virtual {v2}, Lcom/sma/smartv3/model/ProgressMarkers;->getDescribe()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e6c

    return v0
.end method

.method public final setLayoutHeight(II)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->getMRoundPicImage()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getAppScreenWidth()I

    move-result v1

    mul-int/2addr v1, p2

    div-int/2addr v1, p1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;->getMRoundPicImage()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
