.class public final Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTranslateListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateListAdapter.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n87#2,7:71\n94#2,3:79\n70#2,7:82\n97#2:89\n1#3:78\n*S KotlinDebug\n*F\n+ 1 TranslateListAdapter.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter\n*L\n49#1:71,7\n49#1:79,3\n49#1:82,7\n49#1:89\n49#1:78\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTranslateListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateListAdapter.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n87#2,7:71\n94#2,3:79\n70#2,7:82\n97#2:89\n1#3:78\n*S KotlinDebug\n*F\n+ 1 TranslateListAdapter.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter\n*L\n49#1:71,7\n49#1:79,3\n49#1:82,7\n49#1:89\n49#1:78\n*E\n"
    }
.end annotation


# instance fields
.field private final dataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;->dataList:Ljava/util/List;

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;->onBindViewHolder$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;Landroid/view/View;)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->getItemLl()Landroid/widget/LinearLayout;

    move-result-object p0

    const/4 p2, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, p2

    :goto_0
    check-cast p0, Landroid/app/Activity;

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAITitle()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg2"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final deleteAll()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;->onBindViewHolder(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;I)V
    .locals 2
    .param p1    # Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/db/entity/AIRecords;

    .line 3
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->getTimeTv()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMLocalTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->getContentTv()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    :cond_1
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->getItemLl()Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/android/mltcode/paycertificationapi/l06;

    invoke-direct {v1, p1, p2}, Lcom/android/mltcode/paycertificationapi/l06;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0eb8

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public final submitData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;->dataList:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
