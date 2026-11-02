.class public final Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCourseActionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseActionFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseActionFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1869#2,2:76\n*S KotlinDebug\n*F\n+ 1 CourseActionFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseActionFragment\n*L\n46#1:76,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCourseActionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseActionFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseActionFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1869#2,2:76\n*S KotlinDebug\n*F\n+ 1 CourseActionFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseActionFragment\n*L\n46#1:76,2\n*E\n"
    }
.end annotation


# instance fields
.field private mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->showData$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->showData$lambda$0$0$1(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->showData$lambda$0$0(Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Lcom/sma/smartv3/model/ProgressMarkers;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->showData$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Lcom/sma/smartv3/model/ProgressMarkers;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Lcom/sma/smartv3/model/ProgressMarkers;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->showData$lambda$0$0$0$0(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Lcom/sma/smartv3/model/ProgressMarkers;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->showData$lambda$0$0$0$0$0$0(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;ILandroid/view/View;)V

    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0i1011iI;

    invoke-direct {v1, p1, p2, p0}, Lcom/android/mltcode/paycertificationapi/I0i1011iI;-><init>(Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;)V

    const-wide/16 p0, 0x64

    invoke-virtual {v0, p0, p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;)Lkotlin/Unit;
    .locals 8

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ProgressMarkers;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiI0iO;

    invoke-direct {v1, p2, v0}, Lcom/android/mltcode/paycertificationapi/XiI0iO;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Lcom/sma/smartv3/model/ProgressMarkers;)V

    const v0, 0x7f0d0eb1

    invoke-static {p1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/android/mltcode/paycertificationapi/iX1XX;

    invoke-direct {v5}, Lcom/android/mltcode/paycertificationapi/iX1XX;-><init>()V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0$0(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Lcom/sma/smartv3/model/ProgressMarkers;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0111iO;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/I0111iO;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Lcom/sma/smartv3/model/ProgressMarkers;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Lcom/sma/smartv3/model/ProgressMarkers;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_0

    const p4, 0x7f0a05e2

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_0

    const/16 p5, 0x8

    invoke-virtual {p4, p5}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p4

    invoke-static {p4}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object p4

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ProgressMarkers;->getCoverUrl()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p4

    const p5, 0x7f0a05e0

    invoke-virtual {p2, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p5

    invoke-static {p5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p4, p5}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const p4, 0x7f0a05df

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    if-eqz p4, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ProgressMarkers;->getTitle()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p4, 0x7f0a05dc

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    if-eqz p4, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ProgressMarkers;->getTime()I

    move-result p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XOO0XOOii(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const p1, 0x7f0a05de

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance p2, Lcom/android/mltcode/paycertificationapi/OIiXiX;

    invoke-direct {p2, p0, p3}, Lcom/android/mltcode/paycertificationapi/OIiXiX;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0$0$0$0(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;ILandroid/view/View;)V
    .locals 2

    new-instance p2, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;

    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "mArg1"

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-nez p1, :cond_0

    const-string p1, "mCourseDetails"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    const-string v0, "mArg3"

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final showData$lambda$0$0$1(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$render"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.CourseDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/CourseDetails;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    return-void
.end method

.method public initView()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-nez v0, :cond_0

    const-string v0, "mCourseDetails"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/model/CourseDetails;->getProgressMarkers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;->showData(Ljava/util/List;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0264

    return v0
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final showData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ProgressMarkers;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOX0OO;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/OOX0OO;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
