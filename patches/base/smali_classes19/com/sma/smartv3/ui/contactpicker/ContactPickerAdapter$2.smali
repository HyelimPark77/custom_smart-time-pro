.class Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$2;
.super Landroid/widget/Filter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getFilter()Landroid/widget/Filter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$2;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method public performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "constraint"
        }
    .end annotation

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$2;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->iO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$2;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->IiI10X(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$2;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->XOO0ii0(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    :goto_0
    new-instance v0, Landroid/widget/Filter$FilterResults;

    invoke-direct {v0}, Landroid/widget/Filter$FilterResults;-><init>()V

    iput-object p1, v0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    return-object v0
.end method

.method public publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "constraint",
            "results"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$2;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->O00(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$2;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
