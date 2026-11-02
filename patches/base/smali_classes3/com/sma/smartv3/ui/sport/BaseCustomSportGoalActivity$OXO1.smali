.class public final Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->setKeyListener(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Z)Landroid/view/View$OnKeyListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Landroid/widget/EditText;

.field public final synthetic IO:Z


# direct methods
.method public constructor <init>(ZLandroid/widget/EditText;)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity$OXO1;->IO:Z

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity$OXO1;->I1:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-boolean p2, p0, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity$OXO1;->IO:Z

    if-eqz p2, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity$OXO1;->I1:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_0
    return-void
.end method
