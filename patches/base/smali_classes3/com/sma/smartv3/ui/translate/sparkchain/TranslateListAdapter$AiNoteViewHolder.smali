.class public final Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "AiNoteViewHolder"
.end annotation


# instance fields
.field private contentTv:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private itemLl:Landroid/widget/LinearLayout;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;

.field private timeTv:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private titleTv:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;Landroid/view/View;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a009b

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->itemLl:Landroid/widget/LinearLayout;

    const p1, 0x7f0a009f

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->titleTv:Landroid/widget/TextView;

    const p1, 0x7f0a0098

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->contentTv:Landroid/widget/TextView;

    const p1, 0x7f0a009e

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->timeTv:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final getContentTv()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->contentTv:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getItemLl()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->itemLl:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getTimeTv()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->timeTv:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTitleTv()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->titleTv:Landroid/widget/TextView;

    return-object v0
.end method

.method public final setContentTv(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->contentTv:Landroid/widget/TextView;

    return-void
.end method

.method public final setItemLl(Landroid/widget/LinearLayout;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->itemLl:Landroid/widget/LinearLayout;

    return-void
.end method

.method public final setTimeTv(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->timeTv:Landroid/widget/TextView;

    return-void
.end method

.method public final setTitleTv(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter$AiNoteViewHolder;->titleTv:Landroid/widget/TextView;

    return-void
.end method
