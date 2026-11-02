.class public final Lcom/sma/smartv3/ui/ai/AIAnswerActivity;
.super Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;,
        Lcom/sma/smartv3/ui/ai/AIAnswerActivity$XIi00iiXO;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIAnswerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n55#2,12:228\n84#2,3:240\n1#3:243\n1869#4,2:244\n*S KotlinDebug\n*F\n+ 1 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n*L\n129#1:228,12\n129#1:240,3\n210#1:244,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIAnswerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n55#2,12:228\n84#2,3:240\n1#3:243\n1869#4,2:244\n*S KotlinDebug\n*F\n+ 1 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n*L\n129#1:228,12\n129#1:240,3\n210#1:244,2\n*E\n"
    }
.end annotation


# instance fields
.field private final mAdapterSpanCount:I

.field public mLayoutInflater:Landroid/view/LayoutInflater;

.field private final mTabList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mAdapterSpanCount:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    return-void
.end method

.method public static synthetic X01IiOiIi(Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addEditLayout$lambda$1(Landroid/widget/EditText;Landroid/view/View;)V

    return-void
.end method

.method private static final addEditLayout$lambda$1(Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-interface {p0}, Landroid/text/Editable;->clear()V

    return-void
.end method

.method public static synthetic addReyclerView$default(Lcom/sma/smartv3/ui/ai/AIAnswerActivity;Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    iget p2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mAdapterSpanCount:I

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const-string p3, ""

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addReyclerView(Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V

    return-void
.end method

.method private final stitchTabText(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->IiI10X()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->IiI10X()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->IiI10X()Ljava/lang/String;

    move-result-object v1

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    return-object p1
.end method


# virtual methods
.method public final addEditLayout(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V
    .locals 3
    .param p1    # Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "tabData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->getMLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0171

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a058b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v2, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$iO;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$iO;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p1, 0x7f0a058c

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IXXOO;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/IXXOO;-><init>(Landroid/widget/EditText;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final addReyclerView(Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;",
            ")V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tabData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4, p3}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->XOO0ii0(Ljava/lang/String;)V

    new-instance p3, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;

    invoke-direct {v1, p1, p4, v0}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;-><init>(Ljava/util/List;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;Landroid/app/Activity;)V

    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    new-instance p1, Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;

    const/high16 p4, 0x41700000    # 15.0f

    invoke-static {p4}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p4

    invoke-direct {p1, p2, p4}, Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;-><init>(II)V

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final addTitleDescribe(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->getMLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0170

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a00a3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final getMAdapterSpanCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mAdapterSpanCount:I

    return v0
.end method

.method public final getMLayoutInflater()Landroid/view/LayoutInflater;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mLayoutInflater:Landroid/view/LayoutInflater;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mLayoutInflater"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 10

    invoke-super {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const-string v2, "from(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->setMLayoutInflater(Landroid/view/LayoutInflater;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v1

    const/4 v7, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v7

    :goto_0
    if-nez v1, :cond_1

    const/4 v1, -0x1

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$XIi00iiXO;->OXO1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_1
    const v2, 0x7f14104d

    const v3, 0x7f141458

    const-string v4, "getStringArray(...)"

    const/4 v8, 0x2

    const-string v9, "getString(...)"

    packed-switch v1, :pswitch_data_0

    return-void

    :pswitch_0
    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addEditLayout(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V

    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f030002

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/collections/ArraysKt___ArraysKt;->iO0XiOIi([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const v3, 0x7f1403ac

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v4, v1

    move-object v1, v2

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addReyclerView$default(Lcom/sma/smartv3/ui/ai/AIAnswerActivity;Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;ILjava/lang/Object;)V

    return-void

    :pswitch_1
    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f030039

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/collections/ArraysKt___ArraysKt;->iO0XiOIi([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v4, v1

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addReyclerView$default(Lcom/sma/smartv3/ui/ai/AIAnswerActivity;Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;ILjava/lang/Object;)V

    return-void

    :pswitch_2
    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    const v2, 0x7f1413bc

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addEditLayout(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V

    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    const v2, 0x7f141398

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addEditLayout(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V

    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    const-string v2, ""

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f03004f

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/collections/ArraysKt___ArraysKt;->iO0XiOIi([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v4, v1

    move-object v1, v2

    const/4 v2, 0x2

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addReyclerView$default(Lcom/sma/smartv3/ui/ai/AIAnswerActivity;Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;ILjava/lang/Object;)V

    return-void

    :pswitch_3
    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addEditLayout(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V

    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f030015

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/collections/ArraysKt___ArraysKt;->iO0XiOIi([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v4, v1

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addReyclerView$default(Lcom/sma/smartv3/ui/ai/AIAnswerActivity;Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;ILjava/lang/Object;)V

    return-void

    :pswitch_4
    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    const v2, 0x7f140369

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f030046

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/collections/ArraysKt___ArraysKt;->iO0XiOIi([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v4, v1

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addReyclerView$default(Lcom/sma/smartv3/ui/ai/AIAnswerActivity;Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;ILjava/lang/Object;)V

    new-instance v4, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    const v1, 0x7f14133f

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v1, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    const-string v1, "90s"

    const-string v2, "270s"

    const-string v3, "30s"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addReyclerView$default(Lcom/sma/smartv3/ui/ai/AIAnswerActivity;Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;ILjava/lang/Object;)V

    return-void

    :pswitch_5
    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    const v2, 0x7f14028e

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v7, v8, v7}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->O00()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addTitleDescribe(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f03001c

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/collections/ArraysKt___ArraysKt;->iO0XiOIi([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v4, v1

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addReyclerView$default(Lcom/sma/smartv3/ui/ai/AIAnswerActivity;Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;ILjava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public inputContent(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/model/AIFunctionType;->DAILY_WEEKLY:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mTabList:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->IiI10X()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->dismissLoading()V

    const p1, 0x7f1403ae

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    :goto_1
    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->inputContent(Ljava/lang/String;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0023

    return v0
.end method

.method public sendAIQuestion(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->addSendRecord(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$XIi00iiXO;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_1
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const v0, 0x7f1400d0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AIFunction;->getDetailsQuestion()Ljava/lang/String;

    move-result-object v1

    :cond_2
    const v2, 0x7f1400d1

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->stitchTabText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :pswitch_1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->stitchTabText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getDetailsQuestion()Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v0, 0x1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->addReceivedRecord()Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->sendAIQuestion(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final setMLayoutInflater(Landroid/view/LayoutInflater;)V
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->mLayoutInflater:Landroid/view/LayoutInflater;

    return-void
.end method
