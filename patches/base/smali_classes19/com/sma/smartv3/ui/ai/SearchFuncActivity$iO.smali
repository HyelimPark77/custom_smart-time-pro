.class public final Lcom/sma/smartv3/ui/ai/SearchFuncActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/ai/SearchFuncActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$iO;->IO:Lcom/sma/smartv3/ui/ai/SearchFuncActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    if-eqz p2, :cond_0

    const/4 p1, 0x6

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$iO;->IO:Lcom/sma/smartv3/ui/ai/SearchFuncActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->access$getSearchView(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$iO;->IO:Lcom/sma/smartv3/ui/ai/SearchFuncActivity;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->saveRecords(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$iO;->IO:Lcom/sma/smartv3/ui/ai/SearchFuncActivity;

    invoke-static {p2, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->access$editChanged(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Landroid/text/Editable;)V

    const/4 p1, 0x1

    return p1
.end method
