.class public final Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1, p3}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$setMWriteType$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;I)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
